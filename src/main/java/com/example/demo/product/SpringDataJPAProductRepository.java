package com.example.demo.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJPAProductRepository extends JpaRepository<Product, Integer> {

}