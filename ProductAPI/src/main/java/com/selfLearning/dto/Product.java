package com.selfLearning.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Product {

	@JsonProperty("productName")
	private String name;
	
	@JsonProperty("productId")
	private int id;
	
	@JsonProperty("productQuantity")
	private long quantity;
	
	
	private String manufacturer;
	
	
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product() {
		super();
	}
	
	
	
}
