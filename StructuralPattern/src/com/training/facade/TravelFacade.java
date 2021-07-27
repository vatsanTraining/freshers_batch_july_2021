package com.training.facade;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Facade
public class TravelFacade {

	
	   private CheckFligtVacancy fltList;
	   private CheckHotelVacancy hlist;
	   
	 public TravelFacade() {
	  	 super();
		 fltList=new CheckFligtVacancy();
		 hlist=new CheckHotelVacancy();
	}
	   
	   
	public Map<String,List<String>>  checkHotelandFlight(Date from ,Date to)
	{
		
		Map<String,List<String>> status=new HashMap<String, List<String>>();
		
		status.put("hotel",hlist.getHotelPositions(from, to));
		status.put("flight",fltList.getFlightPositions(from, to));

		
		return status;
	}
	   
	   
	
}
