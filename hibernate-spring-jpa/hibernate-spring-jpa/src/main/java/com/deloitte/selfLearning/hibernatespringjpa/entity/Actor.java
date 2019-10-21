package com.deloitte.selfLearning.hibernatespringjpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "Actor_dtls")
public class Actor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "actor_id")
	private long id;
	
	@Column(name = "actor_name")
	private String name;
	
	@ManyToMany(mappedBy = "actor")//, cascade = {CascadeType.ALL}
	private List<Movie> movie= new ArrayList<>();

	public Actor(String name) {
		super();
		this.name = name;
		
	}

	public Actor() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getMovie() {
		return movie;
	}

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}
	
	

}
