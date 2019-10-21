package com.selfLearning.exceptions;

@SuppressWarnings("serial")
public class ContentNotAllowedException extends RuntimeException{
	
	public ContentNotAllowedException(String exception )
	{
		super(exception);
	}

}
