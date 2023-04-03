package com.tarining2_userApplocation.dto;

import org.springframework.web.bind.annotation.RequestBody;

public class UserDto {
	
	private int id;
	
	private String userEmail;
	
	private String password;
	
	private UserDto() {
	}
	
	private UserDto(int id, String userEmail, String password) {
		this.id = id;
		this.userEmail = userEmail;
		this.password=password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String useEmail) {
		this.userEmail = useEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", userEmail=" + userEmail + ", password=" + password + "]";
	}
	
	
}
