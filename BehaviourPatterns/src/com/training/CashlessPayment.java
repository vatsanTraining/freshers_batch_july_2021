package com.training;

import com.training.ifaces.PaymentStrategy;

public class CashlessPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		   System.out.println("Received Payment through CASHLESS - Mediclaim Policy");

	}

}
