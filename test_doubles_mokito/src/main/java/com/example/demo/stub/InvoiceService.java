package com.example.demo.stub;

import java.util.List;

public class InvoiceService {

	private InvoiceRepository repo;

	public InvoiceService(InvoiceRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	List<Invoice>  discountByAmount(int discount,double amount){
		
		    List<Invoice> filteredList = repo.findAllByAmountGt(amount);
		
		    System.out.println(filteredList);
		    for(Invoice eachInvoice:filteredList) {
		    	
		    	double actualAmount = eachInvoice.getAmount();
		    	double discountedAmount =	
		    			   actualAmount -actualAmount * discount/100.0;
		    	
		    	eachInvoice.setAmount(discountedAmount);
		    	
		    	
		    }
		
		     return filteredList;
	}
	
	
}
