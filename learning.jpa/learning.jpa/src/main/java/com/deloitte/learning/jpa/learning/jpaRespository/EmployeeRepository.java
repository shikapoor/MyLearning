package com.deloitte.learning.jpa.learning.jpaRespository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.deloitte.learning.jpa.learning.jpa.entity.Student;

public interface EmployeeRepository extends JpaRepository<Student	, Long>{
	
	@Query("select s from Student s, Guide g where s.guide = g.id and s.name = :stuNam")
	Student findAllStudGuidInfo(@Param("stuNam") String stuNam);

}
