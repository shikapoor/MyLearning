
package com.deloitte.learning.jpa.learning.jpa.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.OverridesAttribute;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String name;
	
	@Embedded
	@AttributeOverrides(
	{
		@AttributeOverride(name = "street" , column = @Column(name = "street_name") ),
		@AttributeOverride(name = "city", column = @Column(name = "city_name"))
	})
	private Address address;
	
	public Person() {}	
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
}
















