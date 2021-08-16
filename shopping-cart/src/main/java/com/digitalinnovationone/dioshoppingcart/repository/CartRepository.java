package com.digitalinnovationone.dioshoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import com.digitalinnovationone.dioshoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Long> {

}
