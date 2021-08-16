package com.digitalinnovationone.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;

import com.digitalinnovationone.productcatalog.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
