package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Component
public class Order {


	private Item item;

	// constructor DI
	@Autowired
	public Order(@Qualifier(value = "fridge") Item item) {
		super();
		this.item = item;
	}
	
	
	
}
