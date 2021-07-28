package com.example.demo.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mockito;


public class TestInvoiceService {

	
	@Test
	@DisplayName("This method checks the count from the Find Invoice Count is equal to expected value")
	public void testInvoiceFindInvoiceCount() {

		InvoiceRepository repo = new FakeInvoiceRepository();
		
		InvoiceService service = new InvoiceService(repo);
		
		Invoice inv1 = new Invoice(201,"Naveen", 2000);
		Invoice inv2 = new Invoice(202,"Vignesh", 3000);
		
		  service.addInvoice(inv1);
		  service.addInvoice(inv2);
		  
		  assertEquals(2, service.findInvoiceCount());
		  
		  
	}
	
	
	@Test
	@DisplayName("This method is executed with Mockito Framework ")
	public void testInvoiceFindInvoiceCountWithMockito() {

		InvoiceRepository repo = Mockito.mock(InvoiceRepository.class);
		
		InvoiceService service = new InvoiceService(repo);
		
		Invoice inv1 = new Invoice(201,"Naveen", 2000);
		Invoice inv2 = new Invoice(202,"Vignesh", 3000);
		
		List<Invoice> invList = new ArrayList<>();
		
		   invList.add(inv1);
		   invList.add(inv2);
		   
		   Mockito.when(repo.findAll()).thenReturn(invList);
		   
		   assertEquals(2, service.findInvoiceCount());
		
		  
	}

}
