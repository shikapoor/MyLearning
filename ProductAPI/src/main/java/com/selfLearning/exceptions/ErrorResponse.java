package com.selfLearning.exceptions;

import java.util.List;

public class ErrorResponse {

	private String meassage;
	private List<String> details;
	
	public String getMeassage() {
		return meassage;
	}
	public void setMeassage(String meassage) {
		this.meassage = meassage;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	public ErrorResponse(String meassage, List<String> details) {
		super();
		this.meassage = meassage;
		this.details = details;
	}
	
	
	
	
}
