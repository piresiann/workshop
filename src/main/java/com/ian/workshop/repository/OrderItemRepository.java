package com.ian.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
