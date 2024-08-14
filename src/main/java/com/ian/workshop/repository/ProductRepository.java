package com.ian.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.workshop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
