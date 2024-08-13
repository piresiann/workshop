package com.ian.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
