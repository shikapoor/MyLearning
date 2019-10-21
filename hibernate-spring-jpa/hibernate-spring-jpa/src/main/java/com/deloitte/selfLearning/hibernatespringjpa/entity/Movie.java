package com.deloitte.selfLearning.hibernatespringjpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "movie_dtls")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_id")
	private long id;
	
	@Column(name = "movie_name")
	private String name;
	
	@Column(name = "director_name")
	private String director;
	
	//@ManyToMany(cascade = {CascadeType.ALL})
	@ManyToMany
	@JoinTable(name ="movie_actor" , 
			   joinColumns = {@JoinColumn (name =  "movie_id") }, 
			   inverseJoinColumns = {@JoinColumn(name= "actor_id")})
    private List<Actor> actor = new ArrayList<>();

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

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<Actor> getActor() {
		return actor;
	}

	public void setActor(List<Actor> actor) {
		this.actor = actor;
	}

	public Movie() {
		super();
	}

	public Movie(String name, String director) {
		super();
		this.name = name;
		this.director = director;
		
	}
	
	
	

}
