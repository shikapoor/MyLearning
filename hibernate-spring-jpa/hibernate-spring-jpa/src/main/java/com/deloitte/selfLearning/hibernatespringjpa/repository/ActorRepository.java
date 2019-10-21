package com.deloitte.selfLearning.hibernatespringjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.selfLearning.hibernatespringjpa.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long>{

}
