package com.example.demo.mocks;

public class InvoiceService {

	private InvoiceRepository repo;

	public InvoiceService(InvoiceRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public void addInvoice(Invoice inv) {
		
			if(inv.getAmount() >5000)
			{
				repo.add(inv);
			}
	}
	
	
	
}
