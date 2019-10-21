package com.deloitte.learning.jpa.learning.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "User_Dtls")
public class UserEntity {

	@Column(name = "user_id",  nullable = false, unique = true)
	@Id 
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	@Column(name = "first_name",  nullable = false)
	private String userFName;
	
	@Column(name = "middle_name", nullable = false)
	private String userMName;
	
	@Column(name = "last_name", nullable = false)
	private String userLName;
	
	@Column(name = "user_role", nullable = false)
	private String role;
	
	
	protected UserEntity(){}
	
	public UserEntity(String userFName, String userMName, String userLName, String role) {
		super();
		this.userFName = userFName;
		this.userMName = userMName;
		this.userLName = userLName;
		this.role = role;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserFName() {
		return userFName;
	}
	public void setUserFName(String userFName) {
		this.userFName = userFName;
	}
	public String getUserMName() {
		return userMName;
	}
	public void setUserMName(String userMName) {
		this.userMName = userMName;
	}
	public String getUserLName() {
		return userLName;
	}
	public void setUserLName(String userLName) {
		this.userLName = userLName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userFName=" + userFName + ", userMName=" + userMName + ", userLName="
				+ userLName + ", role=" + role + "]";
	}
	
}
