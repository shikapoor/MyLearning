package com.in28Minutes.learning.restfulWebService.restfulwebservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


//@SpringBootApplication
public class RestfulWebServiceApplication {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//SpringApplication.run(RestfulWebServiceApplication.class, args);
		
//		 org.springframework.security.crypto.password.PasswordEncoder encoder
//		   = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
//		 String encodedPassword = encoder.encode("demo");  
//		    System.out.print(encodedPassword);
		
//		Integer age = -1;
//
//		CompletableFuture<String> maturityFuture = CompletableFuture.supplyAsync(() -> {
//		    if(age < 0) {
//		        throw new IllegalArgumentException("Age can not be negative");
//		    }
//		    if(age > 18) {
//		        return "Adult";
//		    } else {
//		        return "Child";
//		    }
//		}).exceptionally(ex -> {
//		    System.out.println("Oops! We have an exception - " + ex.getMessage());
//		    return "Unknown!";
//		});
//
//		System.out.println("Maturity : " + maturityFuture.get()); 
//		
//		System.out.println( Runtime.getRuntime().availableProcessors());
		
		
		Set<Integer> xset = new TreeSet<>();
		xset.add(6);
		xset.add(2);
		xset.add(7);
		xset.add(4);
		xset.add(5);
		
		//System.out.println(xset);
		
		
		//for(int i = 0; i<100;i++)
		//xset.stream().unordered().forEach(System.out :: print);
		
		List<String> xlist = new ArrayList<>();
		System.out.println(xlist.contains("s"));
		
		
		
		
	}

}
