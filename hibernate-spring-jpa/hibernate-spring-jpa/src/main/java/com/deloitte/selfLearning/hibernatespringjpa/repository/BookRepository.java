package com.deloitte.selfLearning.hibernatespringjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.selfLearning.hibernatespringjpa.entity.Book;


public interface BookRepository extends JpaRepository<Book , Long> {

}
