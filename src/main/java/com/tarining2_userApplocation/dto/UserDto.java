package com.tarining2_userApplocation.dto;

import org.springframework.web.bind.annotation.RequestBody;

public class UserDto {
	
	private int id;
	
	private String userEmailId;
	
	private String password;
	


	public UserDto() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserEmailId() {
		return userEmailId;
	}


	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public UserDto(int id, String userEmailId, String password) {
		super();
		this.id = id;
		this.userEmailId = userEmailId;
		this.password = password;
	}


	@Override
	public String toString() {
		return "UserDto [id=" + id + ", userEmailId=" + userEmailId + ", password=" + password + "]";
	}
	
	
	
	
}
