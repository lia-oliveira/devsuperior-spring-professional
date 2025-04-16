package com.oliveiralia.dscommerce2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oliveiralia.dscommerce2.dto.ProductDTO;
import com.oliveiralia.dscommerce2.entities.Product;
import com.oliveiralia.dscommerce2.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		Product product = repository.findById(id).get();
		return new ProductDTO(product);		
	}

}
