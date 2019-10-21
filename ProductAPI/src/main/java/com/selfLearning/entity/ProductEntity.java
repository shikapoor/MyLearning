package com.selfLearning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Product_Dtls")
public class ProductEntity {
	
	@Column(name="product_name")
	private String pname;
	
	@Id
	@Column(name = "product_id")
	private Integer pid;
	
	@Column(name="product_quantity")
	private long quantity;
	
	@Column(name ="product_manufacturer")
	private String manufacturer;

	@Column(name = "product_price")
	private double price;
	
	

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

	

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ProductEntity() {
		super();
	}

	public ProductEntity(String pname, Integer pid, long quantity, String manufacturer, double price) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.quantity = quantity;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	
}
