package com.tarining2_userApplocation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tarining2_userApplocation.dto.UserDto;
import com.tarining2_userApplocation.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public String registration(@RequestBody UserDto dto) {
		String result = userService.registration(dto);
		System.out.println(dto);
	return result; 
	}

}
