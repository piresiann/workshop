package com.ian.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ian.workshop.entities.Product;
import com.ian.workshop.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findiById(Long id){
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
