package com.deloitte.learning.jpa.learning.jpa.commandLiner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.deloitte.learning.jpa.learning.jpa.entity.Address;
import com.deloitte.learning.jpa.learning.jpa.entity.Guide;
import com.deloitte.learning.jpa.learning.jpa.entity.Person;
import com.deloitte.learning.jpa.learning.jpa.entity.Student;
import com.deloitte.learning.jpa.learning.jpa.entity.UserEntity;
import com.deloitte.learning.jpa.learning.jpaRespository.GuideRepository;
import com.deloitte.learning.jpa.learning.jpaRespository.PersonDAORepository;
import com.deloitte.learning.jpa.learning.jpaRespository.StudentJPARepository;


//@Component
//public class SpringDataJPACommandLineRunner implements CommandLineRunner {
//	
//	private static final Logger log = LoggerFactory.getLogger(SpringDataJPACommandLineRunner.class);
//	
////	@Autowired
////	UserRepository userRepository;
//	
//	@Autowired
//	PersonDAORepository personDAORepository;
//	
//	@Autowired
//	StudentJPARepository studentJPARepository;
//	
//	@Autowired
//	GuideRepository guideRepository;
//
//	@Override
//	public void run(String... args) throws Exception {
//		UserEntity obj = new UserEntity("Shivani", "", "Kapoor", "user");
//		//userRepository.save(obj);
//		log.info("Another user created with ID " + obj.getId());
//		
//		//Embedding Properties
//		Address address = new Address("200 E Main St", "Seattle", "85123");
//		Person person = new Person("Ruby", address);
//		log.info("Person is inserted with id : "+ personDAORepository.save(person));
//		
//		//Cascadding and Many to One mapping
//		Guide guide = new Guide("2000IM10901", "Ian Lamb", 2000);
//		Student student = new Student("2014AL50456", "Amy Gill", guide);
//		
//		Guide guide1 = new Guide("829939", "Shivani", 2000);
//		Student student1 = new Student("501418", "Vaibhav", guide1);
//		log.info("Students is inserted with id : "+ studentJPARepository.save(student));
//		log.info("Students is inserted with id : "+ studentJPARepository.save(student1));
//		
////		Student stuobj = studentJPARepository.getOne(4l);
////		studentJPARepository.delete(stuobj);
////		log.info("Students is deleted ");
//		
//		
//		
//		Student stu = studentJPARepository.findAllStudGuidInfo("Vaibhav");
//		
//		log.info("findAllStudGuidInfo >>>>>>>> "+ stu.getId());
////		studentJPARepository.delete(stu);
//		stu.setName("Vaibhav Mehta");
//		stu.getGuide().setName("Shivani Mehta");
//		studentJPARepository.save(stu);
//		
//	}
//	
//	
//	
//	
//	
//
//}
