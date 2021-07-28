package com.example.demo;

import javax.persistence.Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Restaurant;
import com.example.demo.repos.RestaurantRepository;

@SpringBootApplication
public class RestaurantInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantInfoServiceApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			RestaurantRepository repo;
			@Override
			public void run(String... args) throws Exception {
				
				  repo.save(new Restaurant(101,"Kamat Hotel","chennai","veg",4.5));
			}
		};
	}
}
