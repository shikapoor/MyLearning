package com.selfLearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.selfLearning.bean.auth.User;

public interface UserRepository extends JpaRepository<User, String>{
	
	@Query("select u from User u where u.email = :email")
	User findByEmail(@Param("email") String email);

}
