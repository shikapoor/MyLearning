package com.example.async.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.async.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
