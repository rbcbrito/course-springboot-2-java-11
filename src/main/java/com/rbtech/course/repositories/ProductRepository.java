package com.rbtech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rbtech.course.antities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
