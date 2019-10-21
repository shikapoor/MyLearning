package com.deloitte.selfLearning.hibernatespringjpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "university_dtls")
public class University {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "university_id")
	private long id;
	
	@Column(name = "university_name")
	private String name;
	
	@OneToMany(mappedBy = "university", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
	List<Student> studentList;

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

	public List<Student> getStudentList() {
		if(studentList==null)
			setStudentList(new ArrayList<>());
		return this.studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public University(String name) {
		super();
		this.name = name;
		
	}

	public University() {
		super();
	}
	
	
	
	

}
