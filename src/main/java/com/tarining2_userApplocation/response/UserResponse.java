package com.tarining2_userApplocation.response;

public class UserResponse {
	
	private String message ;

	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserResponse(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "UserResponse [message=" + message + "]";
	}

	
}
