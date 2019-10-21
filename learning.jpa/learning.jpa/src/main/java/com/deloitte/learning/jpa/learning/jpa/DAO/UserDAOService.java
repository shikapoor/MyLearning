package com.deloitte.learning.jpa.learning.jpa.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.deloitte.learning.jpa.learning.jpa.entity.UserEntity;

@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager ;
	
	public long insert(UserEntity user)
	{
		entityManager.persist(user);
		return user.getId();
	}

}
