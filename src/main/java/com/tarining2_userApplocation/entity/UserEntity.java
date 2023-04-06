package com.tarining2_userApplocation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_application")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "user_email")
	private String userEmailId;
	
	@Column(name = "user_pass")
	private String password;

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

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userEmailId=" + userEmailId + ", password=" + password + "]";
	}
	public UserEntity() {}
	public UserEntity(int id, String userEmailId, String password) {
		super();
		this.id = id;
		this.userEmailId = userEmailId;
		this.password = password;
	}
	
	
}
