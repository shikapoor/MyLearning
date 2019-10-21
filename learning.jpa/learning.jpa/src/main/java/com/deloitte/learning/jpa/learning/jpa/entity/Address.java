
package com.deloitte.learning.jpa.learning.jpa.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String street;
	private String city;
	private String zipcode;
	
	public Address() {}
	public Address(String street, String city, String zipcode) {
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}	
	
}







