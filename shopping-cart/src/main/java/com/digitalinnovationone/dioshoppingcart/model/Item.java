package com.digitalinnovationone.dioshoppingcart.model;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long productId;
	private Integer amount;
	
	public Item() {}
	
	public Item(Long productId, Integer amount) {
		this.productId = productId;
		this.amount = amount;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
