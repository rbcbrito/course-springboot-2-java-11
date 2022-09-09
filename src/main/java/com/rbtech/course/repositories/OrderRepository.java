package com.rbtech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rbtech.course.antities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
