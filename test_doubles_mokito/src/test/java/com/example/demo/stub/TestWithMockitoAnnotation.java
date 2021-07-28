package com.example.demo.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TestWithMockitoAnnotation {

	  @Mock
	  InvoiceRepository stub;
	 
	 
	  @InjectMocks
	  InvoiceService service ;
	   
	  @Before
	  public void setUp() {
		   
		   MockitoAnnotations.initMocks(this);
	   }
	     
	@Test
	@DisplayName("This method uses the Stub to run the tests")
	public void testInvoiceFindInvoiceCount() {

     	
		List<Invoice> list =
				Arrays.asList(new Invoice(709,"Vikas",7000),new Invoice(710,"uma",6000));
		
		when(stub.findAllByAmountGt(5000)).thenReturn(list);
            
            List<Invoice> filteredList = service.discountByAmount(10, 5000);
		
		           
		  assertEquals(6300, filteredList.get(0).getAmount());
		  
		  assertEquals(5400, filteredList.get(1).getAmount());
		  
	}

}
