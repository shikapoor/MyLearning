package com.deloitte.learning.jpa.learning.jpaRespository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.learning.jpa.learning.jpa.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
