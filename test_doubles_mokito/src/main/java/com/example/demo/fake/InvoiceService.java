package com.example.demo.fake;

public class InvoiceService {

	private InvoiceRepository repo;

	public InvoiceService(InvoiceRepository repo) {
		super();
		this.repo = repo;
	}
	
	
	public void addInvoice(Invoice inv) {
		
		 repo.add(inv);
	}
	
	public int findInvoiceCount() {
		
		return repo.findAll().size();
	}
	
	
}
