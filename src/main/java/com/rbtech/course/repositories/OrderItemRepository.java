package com.rbtech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rbtech.course.antities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
