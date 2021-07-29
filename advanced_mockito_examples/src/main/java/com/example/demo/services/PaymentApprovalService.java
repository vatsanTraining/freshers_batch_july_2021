package com.example.demo.services;

import com.example.demo.ifaces.CardPayment;

public class PaymentApprovalService {

	
	private CardPayment pmtAprroval;


	public PaymentApprovalService(CardPayment pmtAprroval) {
		super();
		this.pmtAprroval = pmtAprroval;
	}
	
	
	public boolean applyForApproval(long cardNumber,String merchant) {
		
		 boolean result = false;
		if(!merchant.contains("jewellery")) {
			
			result = this.pmtAprroval.approve(cardNumber, merchant);
		} 
		
		return result;
	}
}
