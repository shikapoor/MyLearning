package com.selfLearning.DAO;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.selfLearning.entity.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{
	
	public ArrayList<ProductEntity> findAll();
	
	@Query("select p from ProductEntity p where p.id = :prodId")
	public Optional<ProductEntity> findById(@Param("prodId") Integer Id);

}
