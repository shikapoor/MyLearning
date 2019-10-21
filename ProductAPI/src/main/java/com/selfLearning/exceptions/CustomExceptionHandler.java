package com.selfLearning.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(ProductNotFoundException.class)
	public final ResponseEntity<Object> handleProductNotFoundException(ProductNotFoundException ex, WebRequest reques)
	{
		List<String> details = new ArrayList<>();
		details.add(ex.getLocalizedMessage());
		ErrorResponse error = new ErrorResponse("Product Not found Exception", details);
		return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(ContentNotAllowedException.class)
	public final ResponseEntity<Object> handleContentNotAllowedExceptions(ContentNotAllowedException ex, WebRequest request)
	{
		List<String> details = new ArrayList<String>();
		details.add(ex.getLocalizedMessage());
		ErrorResponse error = new ErrorResponse("Improper Data received", details);
		return new ResponseEntity<Object>(error, HttpStatus.BAD_REQUEST);
	}
	
	
    @Override
	protected  ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request)
	{
		List<String> details = new ArrayList<String>();
		details.add(ex.getBindingResult().toString());
		ErrorResponse errorDetails = new ErrorResponse( "Validation Failed", details);
		return new ResponseEntity<Object>(errorDetails, HttpStatus.BAD_REQUEST);
	}
    
    

}
