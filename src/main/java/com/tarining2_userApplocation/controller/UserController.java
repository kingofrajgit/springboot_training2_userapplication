package com.tarining2_userApplocation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tarining2_userApplocation.dto.UserDto;
import com.tarining2_userApplocation.response.UserResponse;
import com.tarining2_userApplocation.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<?> registration(@RequestBody UserDto dto) {
		
		try {
		  String result =  userService.registration(dto);
		  UserResponse res = new UserResponse();
		  res.setMessage(result);
		  return new ResponseEntity<>(res,HttpStatus.OK);
		}catch(Exception e) {
		  return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST); 
		}
	}

}
