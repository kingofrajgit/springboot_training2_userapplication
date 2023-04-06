package com.tarining2_userApplocation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarining2_userApplocation.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	UserEntity findByUserEmailId(String mail);


}
