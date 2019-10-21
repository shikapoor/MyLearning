package com.deloitte.learning.jpa.learning.jpaRespository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.deloitte.learning.jpa.learning.jpa.entity.Chapter;

@EnableJpaRepositories
public interface ChapterRepository extends  JpaRepository<Chapter, Long>{

}
