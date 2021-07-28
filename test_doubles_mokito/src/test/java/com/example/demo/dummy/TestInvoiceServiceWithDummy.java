package com.example.demo.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mockito;

import com.example.demo.mock.*;


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
	
	
	@Test
	@DisplayName("This test method uses mockito framework")
	public void testInvoiceFindInvoiceCountWithMockito() {

		InvoiceRepository invMock = Mockito.mock(InvoiceRepository.class);
		
		EmailService emailMock = Mockito.mock(EmailService.class);
		
		
		
		InvoiceService service = new InvoiceService(invMock,emailMock);
		
		Invoice inv1 = new Invoice(201,"Naveen", 2000);
		Invoice inv2 = new Invoice(202,"Vignesh", 3000);
		
		Collection<Invoice> invList = new ArrayList<>();
		
		   invList.add(inv1);
		   invList.add(inv2);
		   
		   Mockito.when(invMock.findAll()).thenReturn(invList);
		   
		   assertEquals(2, service.findInvoiceCount());

		  
		  
	}
}
