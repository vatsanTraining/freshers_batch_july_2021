package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.model.Item;
import com.example.demo.model.Order;
import com.example.demo.model.OrderBook;

@SpringBootApplication
public class SpringBootQuickstartApplication {

	
	public static void main(String[] args) {
	ConfigurableApplicationContext ctx	=SpringApplication.run(SpringBootQuickstartApplication.class, args);
	
	  System.out.println(ctx.getClass());
	  
      //System.out.println(ctx.getBean(Item.class));
      
      
      System.out.println(ctx.getBean("fridge",Item.class));

       OrderBook book = ctx.getBean(OrderBook.class);
       
        book.getOrderList().forEach(System.out::println);
      
	
	}
	
	//Factory Method 
	
	@Bean
	public Item tv() {
		
		return new Item(101,"sonytv" , "led tv", 27000);
	}
	
	@Bean
	public Item fridge() {
		
		return new Item(102,"samsung" , "double door ", 57000);
	}
	
	@Bean
	public Item laptop() {
		
		return new Item(103,"lenova" , "ram 8gb ", 77000);
	}
	
	@Bean
	public Order tvOrder() {
		
		Order order = new Order();
		 order.setItem(tv());
		 
		 return order;
	}
	
	@Bean
	public Order lapTopOrder() {
		
		return new Order(laptop());
	}
	
}
