package com.selfLearning.exceptions.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.selfLearning.dto.Product;

@Component
public class ProductValidator  implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return ProductValidator.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Product product = (Product) target;
		ValidationUtils.rejectIfEmpty(errors, "name", "Product name cannot be left empty");
		ValidationUtils.rejectIfEmpty(errors, "manufacturer", "Manufacturer cannot be left empty");
		
		if(product.getPrice() < 10)
			errors.rejectValue("price" , "Procduct price cannot be less then 10");
		
	}

}
