package com.digitalinnovationone.dioshoppingcart.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalinnovationone.dioshoppingcart.model.Cart;
import com.digitalinnovationone.dioshoppingcart.model.Item;
import com.digitalinnovationone.dioshoppingcart.repository.CartRepository;

@RestController
@RequestMapping(value = "/cart")
public class CartController {

	@Autowired
	private CartRepository repository;
	
	@PostMapping(value = "/{id}")
	public Cart addItem(@PathVariable("id") Long id, @RequestBody Item item) {
		Optional<Cart> savedCart = repository.findById(id);
		Cart cart;
		if(savedCart.equals(Optional.empty())) {
			cart = new Cart(id);
		} else {
			cart = savedCart.get();
		}
		cart.getItems().add(item);
		return repository.save(cart);
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Cart> findById(@PathVariable("id") Long id) {
		return repository.findById(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public void clear(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
}
