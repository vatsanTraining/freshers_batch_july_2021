package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repos.RestaurantRepository;
import com.example.demo.entity.*;
@Service
public class RestaurantService {

	
	@Autowired
	private RestaurantRepository repo;
	
	
	public List<Restaurant> findAll(){
		
		return this.repo.findAll();
	}
	
	
	public Restaurant add(Restaurant entity) {
		
		return this.repo.save(entity);
	}
	
	public Optional<Restaurant> findById(int id){
		
		return this.repo.findById(id);
	}
}
