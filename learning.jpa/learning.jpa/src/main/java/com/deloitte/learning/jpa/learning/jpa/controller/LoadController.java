package com.deloitte.learning.jpa.learning.jpa.controller;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class LoadController {
	
	@Autowired
	RestTemplate restTemplate ;

	@RequestMapping(path = "/get/AlltaskDetails" , method = RequestMethod.GET)
	public ResponseEntity<Object> getAllTaskDtls()
	{
		
		String plainCreds = "shivani:12345";
		byte[] plainCredsBytes = plainCreds.getBytes();
		byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
		String base64Creds = new String(base64CredsBytes);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Basic " + base64Creds);
		
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<Object> response = restTemplate.exchange("http://localhost:8085/todo/get", HttpMethod.GET, request, Object.class);
		
		return response;
	}
}
