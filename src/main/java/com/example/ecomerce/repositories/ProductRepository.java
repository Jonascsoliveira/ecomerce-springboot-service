package com.example.ecomerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecomerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
