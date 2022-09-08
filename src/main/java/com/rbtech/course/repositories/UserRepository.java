package com.rbtech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rbtech.course.antities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
