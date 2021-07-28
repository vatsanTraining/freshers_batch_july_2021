package com.example.demo.dummy;

public class InvoiceService {

	private InvoiceRepository repo;

	private EmailService emailService;
	
	
	
	public InvoiceService(InvoiceRepository repo, EmailService emailService) {
		super();
		this.repo = repo;
		this.emailService = emailService;
	}

	public void addInvoice(Invoice inv) {
		
		 repo.add(inv);
	}
	
	public int findInvoiceCount() {
		
		return repo.findAll().size();
	}
	
	
}
