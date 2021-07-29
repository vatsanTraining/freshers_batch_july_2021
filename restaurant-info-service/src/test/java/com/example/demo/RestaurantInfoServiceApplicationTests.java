package com.example.demo;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.BDDMockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.doReturn;
import static org.mockito.ArgumentMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.entity.Restaurant;
import com.example.demo.services.RestaurantService;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class RestaurantInfoServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
    MockMvc mockMvc;
	
    @Autowired
    ObjectMapper mapper;
    
    @MockBean
    RestaurantService service;
    
    Restaurant RECORD_1 = new Restaurant(101,"Kamat Hotel","chennai","veg",4.5);
    Restaurant RECORD_2 = new Restaurant(102,"krishna Hotel","pune","veg",4.5);
    Restaurant RECORD_3 = new Restaurant(103,"Kamat Residency","goa","veg",4.5);

    
   

    @Test
     void getAllRecords_success() throws Exception {
        List<Restaurant> records = new ArrayList<>(Arrays.asList(RECORD_1, RECORD_2, RECORD_3));
        
        given(service.findAll()).willReturn(records);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/restaurants")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(3)))
                .andExpect(jsonPath("$[2].restaurantName", is("Kamat Hotel")));
    }
    
    
      
    
    

    @Test
    public void getRestaurant_success() throws Exception {
    	
        given(service.findById(RECORD_1.getId())).willReturn(java.util.Optional.of(RECORD_1));

        mockMvc.perform(MockMvcRequestBuilders
                .get("/restaurants/101")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", notNullValue()))
                .andExpect(jsonPath("$.restaurantName", is("Kamat Hotel")));
    }
    
    @Test
    public void createRecord_success() throws Exception {
        Restaurant record = new Restaurant(200, "sugna", "goa", "nonveg", 4.6);

        given(service.add(record)).willReturn(record);

        mockMvc.perform(MockMvcRequestBuilders.post("/restaurants")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(record)))

                .andExpect(status().isCreated())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.restaurantName", is("suguna")));
    
    }
	public static String asJsonString(Restaurant entity) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.writeValueAsString(entity);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}


}
