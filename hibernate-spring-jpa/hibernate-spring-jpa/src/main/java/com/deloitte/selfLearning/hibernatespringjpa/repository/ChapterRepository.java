package com.deloitte.selfLearning.hibernatespringjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deloitte.selfLearning.hibernatespringjpa.entity.Chapter;

public interface ChapterRepository extends JpaRepository<Chapter, Long>{

}
