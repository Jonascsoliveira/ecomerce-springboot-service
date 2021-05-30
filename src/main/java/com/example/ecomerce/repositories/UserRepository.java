package com.example.ecomerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecomerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
