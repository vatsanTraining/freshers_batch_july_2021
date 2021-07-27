package com.training.facade;

import java.util.Date;
import java.util.Dictionary;
import java.util.List;
import java.util.Map;

public class FacadeClient {

	public static void print(List<String> items)
	{
		for(String s:items)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		 TravelFacade facade=new TravelFacade();
		 
		    Map<String,List<String>> status=facade.checkHotelandFlight(new Date(), new Date());
		    
		    		    
		    System.out.println("Flight Positions");
		    
		    List<String> fltList =status.get("flight");
		  
	          print(fltList);
	        
	        		    
          System.out.println("Hotel Positions");
		    
		    List<String> hotList =status.get("hotel");
		    
		    print(hotList);
		    
		    
	}
}
