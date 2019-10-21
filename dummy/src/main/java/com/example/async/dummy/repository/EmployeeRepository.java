package com.example.async.dummy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.async.dummy.entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
