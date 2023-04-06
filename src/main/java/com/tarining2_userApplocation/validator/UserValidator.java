package com.tarining2_userApplocation.validator;

import com.tarining2_userApplocation.dto.UserDto;

public class UserValidator {

	public static void registerDataValidation(UserDto dto) throws Exception {
		
		String userMail = dto.getUserEmailId();
		String password = dto.getPassword();
		if(userMail == null || userMail.isEmpty() || userMail.isBlank() ||! userMail.contains("@gmail.com") ){
			throw new Exception( " 1. please enter the valide mailid");
		}
		if (password == null || password.isBlank() || password.isEmpty()) {
			throw new Exception("passwor Should be not null");
		}
		else if (password.length() < 8) {
			throw new Exception("password must be 8 characters");
		}
	}

}
