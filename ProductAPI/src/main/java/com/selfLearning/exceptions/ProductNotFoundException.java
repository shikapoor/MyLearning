package com.selfLearning.exceptions;

@SuppressWarnings("serial")
public class ProductNotFoundException extends RuntimeException {
	
	public ProductNotFoundException(String exception)
	{
		super(exception);
	}

}
