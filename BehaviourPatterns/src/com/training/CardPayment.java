package com.training;

import com.training.ifaces.PaymentStrategy;

public class CardPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		   System.out.println("Received Payment through Card");

	}

}
