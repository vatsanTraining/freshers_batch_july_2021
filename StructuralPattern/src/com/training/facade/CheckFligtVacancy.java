package com.training.facade;
//Sub system - 2

import java.util.*;
public class CheckFligtVacancy {

	private List<String> flts;
	
	public CheckFligtVacancy(){
		
		flts=new ArrayList<String>();
	}
	
	
	public List<String> getFlightPositions(Date from, Date to)
	{
		
		getIndigoStaus(from, to);
		getAirCostoStaus(from, to);
		return flts;
	}
	
	public void getIndigoStaus(Date from, Date to){
		
		flts.add("Indigo -20");
	}
	
	
    public void getAirCostoStaus(Date from, Date to){
		
		flts.add("Aircosta -30");
	}
}
