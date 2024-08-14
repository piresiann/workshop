package com.ian.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
