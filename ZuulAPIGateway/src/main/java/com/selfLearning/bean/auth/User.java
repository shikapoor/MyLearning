package com.selfLearning.bean.auth;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name= "user")
public class User {

	@Id
	private String id;
	@Email(message = "*Please provide a valid email")
	@NotEmpty(message = "*Please provide an email")
	private String email;
	@NotEmpty(message = "*Please provide your name")
	private String password;
	@NotEmpty(message = "*Please provide your name")
	private String name;
	@NotEmpty(message = "*Please provide your last name")
	private String lastName;
	private Integer active=1;
	private boolean isLoacked=false;
	private boolean isExpired=false;
	private boolean isEnabled=true;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = { @JoinColumn(name = "user_id") },
            inverseJoinColumns = { @JoinColumn(name = "role_id") })
	private Set<Role> role;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getActive() {
		return active;
	}
	public void setActive(Integer active) {
		this.active = active;
	}
	public boolean isLoacked() {
		return isLoacked;
	}
	public void setLoacked(boolean isLoacked) {
		this.isLoacked = isLoacked;
	}
	public boolean isExpired() {
		return isExpired;
	}
	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}
	public boolean isEnabled() {
		return isEnabled;
	}
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	public Set<Role> getRole() {
		return role;
	}
	public void setRole(Set<Role> role) {
		this.role = role;
	}
	
	
}
