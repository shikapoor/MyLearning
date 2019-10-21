package com.deloitte.selfLearning.hibernatespringjpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.selfLearning.hibernatespringjpa.entity.University;

public interface UniversityRepository extends JpaRepository<University, Long>{
	
	public University findByName(String name);

}
