package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping(path = "/restaurants/{id}")
	public Restaurant findById(@PathVariable("id") int id){
		
		  return this.service.findById(id).get();
	}
//	
//	@DeleteMapping(path = "/restaurants")
//	public Restaurant remove(@RequestBody Restaurant entity){
//		
//		//todo
//	}
	

	@PostMapping(path = "/restaurants")
	public ResponseEntity<Restaurant> add(@RequestBody Restaurant entity){
		
		Restaurant addedEntity = this.service.add(entity);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);		
	}
	
	
	
}
