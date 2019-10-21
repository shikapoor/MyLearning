package com.selfLearning.service;

import java.util.ArrayList;

import com.selfLearning.dto.Product;

public interface ProductService {
	
	public ArrayList<Product> getAllProducts();
	
	public Product getProductById(int prodId);
	
	public int addProduct(Product prodObj);
 
}
