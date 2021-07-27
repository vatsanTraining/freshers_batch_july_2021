package com.training;

public class Application {

	public static void main(String[] args) {
		Patient p1 =new Patient(4500);

		Patient p2 =new Patient(3500);



		p1.setStrategy(new CashlessPayment());

		      p1. makePayment();

		   p2.setStrategy(new CardPayment());
		     
		      p2. makePayment();

	}
	
}
