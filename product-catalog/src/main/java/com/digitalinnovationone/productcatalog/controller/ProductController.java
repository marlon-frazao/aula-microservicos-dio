package com.digitalinnovationone.productcatalog.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalinnovationone.productcatalog.model.Product;
import com.digitalinnovationone.productcatalog.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductRepository repository;

	@PostMapping
	Product create(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@GetMapping(value = "/{id}")
	Optional<Product> findById(@PathVariable Long id) {
		return repository.findById(id);
	}
}
