package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.entity.Customer;
import com.training.entity.ifaces.CustomerRepository;

@SpringBootTest
class TestingWithInMemoryDbApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	CustomerRepository repo;

	  @Test
	 public void testRowsAdded() {
		 
	     Customer  customerActual= repo.save(new Customer(202, "Shiv"));

        Optional<Customer> expected = repo.findById(customerActual.getId());
        
          assertEquals(customerActual.getName(),expected.get().getName());
     }


}
