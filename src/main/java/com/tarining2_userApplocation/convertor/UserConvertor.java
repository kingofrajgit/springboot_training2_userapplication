package com.tarining2_userApplocation.convertor;

import com.tarining2_userApplocation.dto.UserDto;
import com.tarining2_userApplocation.entity.UserEntity;

public class UserConvertor {

	public static UserEntity toEntity(UserDto dto) {
		UserEntity entity = new UserEntity();
		entity.setId(dto.getId());
		entity.setUserEmailId(dto.getUserEmailId());
		entity.setPassword(dto.getPassword());
		return entity;
	}

}
