package com.example.demo.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


public class TestInvoiceServiceWithStub {

	@Test
	@DisplayName("This method uses the Stub to run the tests")
	public void testInvoiceFindInvoiceCount() {

        InvoiceRepository stub = new InvoiceRepositoryStub();
		
        InvoiceService service = new InvoiceService(stub);
         
            
            List<Invoice> filteredList = service.discountByAmount(10, 5000);
		
		
            
		  assertEquals(6300, filteredList.get(0).getAmount());
		  
		  assertEquals(5400, filteredList.get(1).getAmount());
		  
	}
}
