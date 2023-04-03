package com.tarining2_userApplocation.service;

import org.springframework.stereotype.Service;

import com.tarining2_userApplocation.dto.UserDto;
import com.tarining2_userApplocation.validator.UserValidator;

@Service
public class UserService {

	public String registration(UserDto dto) {
		
		String result = UserValidator.registerDataValidation(dto);
		
		return result;
	}

}
