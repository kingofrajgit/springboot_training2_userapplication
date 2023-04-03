package com.tarining2_userApplocation.validator;

import com.tarining2_userApplocation.dto.UserDto;

public class UserValidator {

	public static String registerDataValidation(UserDto dto) {
		
		String userMail = dto.getUserEmail();
		String password = dto.getPassword();
		String result = "success";
		
		if(userMail == null || userMail.isEmpty() || userMail.isBlank()){
			result= " 1. please enter the valide mailid";
		}
//		raj@gmail.com
		else if(! userMail.contains("@gmail.com")) {
			result= "2. please enter the valide mailid";
		}
		if (password == null || password.isBlank() || password.isEmpty()) {
			result= "passwor Should be not null";
		}
		else if (password.length() < 8) {
			result= "password must be 8 characters";
		}
		return result;
	}

}
