package com.rbtech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rbtech.course.antities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
