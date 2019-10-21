package com.deloitte.selfLearning.hibernatespringjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "student_dtls")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private long id;
	
	
	@Column(name  = "student_name")
	private String name;
	
	@Column(name = "course_name")
	private String course;
	
	@ManyToOne
	@JoinColumn(name = "university_id")
	private University university;

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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public Student(String name, String course, University uni) {
		super();
		this.name = name;
		this.course = course;
		this.university = uni;
	}

	public Student() {
		super();
	}
	
	

}
