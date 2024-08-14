package com.ian.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ian.workshop.entities.Category;
import com.ian.workshop.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findiById(Long id){
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
