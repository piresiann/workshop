package com.ian.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ian.workshop.entities.Order;
import com.ian.workshop.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;

	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findiById(Long id){
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
