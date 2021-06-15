package com.example.ecomerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecomerce.entities.Order;;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
