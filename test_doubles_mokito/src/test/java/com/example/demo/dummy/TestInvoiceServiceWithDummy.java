package com.example.demo.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class TestInvoiceServiceWithDummy {

	@Test
	@DisplayName("This test method uses the Dummy Email Service Implementation")
	public void testInvoiceFindInvoiceCount() {

		InvoiceRepository repo = new FakeInvoiceRepository();
		
		DummyEmailServiceImpl emailService = new DummyEmailServiceImpl();
		
		InvoiceService service = new InvoiceService(repo,emailService);
		
		Invoice inv1 = new Invoice(201,"Naveen", 2000);
		Invoice inv2 = new Invoice(202,"Vignesh", 3000);
		
		  service.addInvoice(inv1);
		  service.addInvoice(inv2);
		  
		  assertEquals(2, service.findInvoiceCount());
		  
		  
	}
}
