package com.selfLearning.Controller;

import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.selfLearning.dto.Product;
import com.selfLearning.exceptions.ProductNotFoundException;
import com.selfLearning.exceptions.validator.ProductValidator;
import com.selfLearning.service.ProductService;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("ProductAPI")
public class ProductController {
	
	@Autowired
	ProductService prodService;
	
	@Autowired
	ProductValidator prodValidator;
	
	
	@RequestMapping(value="/all" , method = RequestMethod.GET)
	public ResponseEntity<ArrayList<Product>> getAllProducts()
	{
		return new ResponseEntity<ArrayList<Product>>(prodService.getAllProducts(), HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/product/{productID}" , method = RequestMethod.GET)
	public ResponseEntity<Product> getProductById(@PathVariable String productID)
	{
		Product prodObj = prodService.getProductById(Integer.parseInt(productID));
		if(prodObj == null)
			throw new ProductNotFoundException("Product Not found with Product ID : "+productID);
		else
		    return new ResponseEntity<Product>(prodObj, HttpStatus.OK);
	}
	
	@RequestMapping(value="product2/add", method = RequestMethod.POST)
	public ResponseEntity<String> addProduct2(@RequestBody @Valid Product prod)
	{
		int newProdId = prodService.addProduct(prod);
		return new ResponseEntity<String>("Product created with productId : "+ newProdId, HttpStatus.CREATED );
			
		
	}
	
	@RequestMapping(value="product/add", method = RequestMethod.POST)
	public ResponseEntity<String> addProduct(@RequestBody @Valid Product prod, Errors error)
	{
		prodValidator.validate(prod, error);
		 if (error.hasErrors()) {
	            return new ResponseEntity<>(createErrorString(error), HttpStatus.BAD_REQUEST);
	        }
		 else
		 {
			 int newProdId = prodService.addProduct(prod);
				return new ResponseEntity<String>("Product created with productId : "+ newProdId, HttpStatus.CREATED );
		 }
	}
	
	  private String createErrorString(Errors errors) {
	        return errors.getAllErrors().stream().map(ObjectError::toString).collect(Collectors.joining(","));
	    }

}
