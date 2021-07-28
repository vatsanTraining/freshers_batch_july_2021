package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.demo.entity.*;
import com.example.demo.services.RestaurantService;

@RestController
public class RestaurantController {

	
	@Autowired
	private RestaurantService service;
	
	@GetMapping(path = "/restaurants")
	public List<Restaurant> findAll(){
		
		return this.service.findAll();
	}
	

	@PostMapping(path = "/restaurants")
	public ResponseEntity<Restaurant> add(@RequestBody Restaurant entity){
		
		Restaurant addedEntity = this.service.add(entity);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);		
	}
	
	
}
