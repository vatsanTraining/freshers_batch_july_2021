package com.example.demo.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.example.demo.mocks.Invoice;
import com.example.demo.mocks.InvoiceRepository;
import com.example.demo.mocks.InvoiceService;


public class TestWithMock {

	@Test
	@DisplayName("This method verifies with custom created Mock")
	public void testIvoiceAdd() {

		InvoiceRepositoryMock repo = new InvoiceRepositoryMock();
		
		InvoiceService service = new InvoiceService(repo);
		
		Invoice inv1 = new Invoice(201,"Naveen", 8000);
		Invoice inv2 = new Invoice(202,"Vignesh", 6000);
		
		  service.addInvoice(inv1);
		  
          repo.verify(1, inv1);

		  service.addInvoice(inv2);
		  
           repo.verify(2, inv2);
           
           
		 
		  
	}
}
