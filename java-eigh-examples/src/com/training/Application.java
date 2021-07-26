package com.training;

import com.training.ifaces.Converter;

public class Application {

	public static void main(String[] args) {

		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
                 System.out.println("Inside Runnable");				
			}
		};
		
		Runnable task2 = () -> {System.out.println("Inside Runnable");};
	
		Thread t = new Thread(task2);
		
		t.start();
		
		
		//Converter<Double, Double> currencyConverter =(Double inr) -> { return inr * 70.00D ;};
		
		Converter<Double, Double> currencyConverter =( inr) -> inr * 70.00 ;
		
		 System.out.println(currencyConverter.convert(56.00));
		 
		 	 
		
	}

}
