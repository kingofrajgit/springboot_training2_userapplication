package com.tarining2_userApplocation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarining2_userApplocation.convertor.UserConvertor;
import com.tarining2_userApplocation.dto.UserDto;
import com.tarining2_userApplocation.entity.UserEntity;
import com.tarining2_userApplocation.repository.UserRepository;
import com.tarining2_userApplocation.validator.UserValidator;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	public String registration(UserDto dto) throws Exception {
		
		UserValidator.registerDataValidation(dto);
		UserEntity entity = UserConvertor.toEntity(dto);
		String mail = entity.getUserEmailId();
		UserEntity entity2 = repo.findByUserEmailId(mail);
		if (entity2 == null) {
			repo.save(entity);
			return "Success";
		}else {
			return" this email is already exist";
		}
	}

}
