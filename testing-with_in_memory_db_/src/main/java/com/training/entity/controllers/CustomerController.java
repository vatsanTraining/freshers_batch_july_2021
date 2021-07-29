package com.training.entity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.training.entity.Customer;
import com.training.entity.services.CustomerService;

@RestController
public class CustomerController {

	
	@Autowired
	private CustomerService service;
	
	
	@GetMapping(path = "/customer/{srchName}")
	public List<Customer> findCustomerByName(@PathVariable("srchName") String name){
		
		return this.service.findByName(name);
		
	}
	
	
	@PostMapping(path = "/customer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer entity){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.add(entity));
		
		
		
	}
	
	
	
	
}
