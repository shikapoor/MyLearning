package com.deloitte.selfLearning.hibernatespringjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.selfLearning.hibernatespringjpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
