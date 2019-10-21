package com.deloitte.learning.jpa.learning.jpa.commandLiner;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.deloitte.learning.jpa.learning.jpa.DAO.UserDAOService;
import com.deloitte.learning.jpa.learning.jpa.entity.Address;
import com.deloitte.learning.jpa.learning.jpa.entity.Person;
import com.deloitte.learning.jpa.learning.jpa.entity.UserEntity;
import com.deloitte.learning.jpa.learning.jpaRespository.PersonDAORepository;

//@Component
//public class AutoJPACommandLineRunner implements CommandLineRunner{
//	
//	private static final Logger log = LoggerFactory.getLogger(AutoJPACommandLineRunner.class);
//
//	@Autowired
//	UserDAOService userDAOService;
//	
//	
//	
//	@Override
//	public void run(String... args) throws Exception {
//
//		log.info("User ID generated is :" + userDAOService.insert(new UserEntity("Shivani", "Vaibhav", "Mehta", "admin")));
//		
//		
//		
//	}
//	
//	
//	
//
//}
