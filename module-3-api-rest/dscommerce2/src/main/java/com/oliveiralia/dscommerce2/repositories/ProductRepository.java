package com.oliveiralia.dscommerce2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiralia.dscommerce2.entities.Product;


public interface ProductRepository extends JpaRepository<Product,Long>{

}
