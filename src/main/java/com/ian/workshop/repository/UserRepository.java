package com.ian.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
