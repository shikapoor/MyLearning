package com.selfLearning.jwt.security;

public class AuthenticationException extends RuntimeException{
	public AuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}
}
