package com.deloitte.selfLearning.hibernatespringjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAsync
public class HibernateSpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateSpringJpaApplication.class, args);
	}

}
