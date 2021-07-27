package com.training.facade;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
// Sub system - 1
public class CheckHotelVacancy {

	List<String> hotelList;
	public CheckHotelVacancy(){
		
		 hotelList = new ArrayList<String>();
	}
	
	public List<String> getHotelPositions(Date from, Date to)
	{
		
		
		getGingerPosition(from, to);
		getOrangePosition(from, to);
		
		return hotelList;
	}

	public void getGingerPosition(Date from, Date to){
		
		hotelList.add("Ginger-30");
	}
	
    public void getOrangePosition(Date from, Date to){
		
	   hotelList.add("orange-20");
	}
	
}
