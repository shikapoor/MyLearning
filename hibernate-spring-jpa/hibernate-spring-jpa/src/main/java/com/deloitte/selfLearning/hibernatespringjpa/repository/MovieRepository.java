package com.deloitte.selfLearning.hibernatespringjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.selfLearning.hibernatespringjpa.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
