package com.example.demo.mock;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.demo.mocks.Invoice;
import com.example.demo.mocks.InvoiceRepository;
import com.example.demo.mocks.InvoiceService;

public class TestWithMockitoAnnotation {

	  @Mock
	  InvoiceRepository repoMock;
	 	 
	  @InjectMocks
	  InvoiceService service ;
	   
	  @Before
	  public void setUp() {
		   
		   MockitoAnnotations.initMocks(this);
	   }

	    @Test
		@DisplayName("This method verifies with Mockito Framework")
		public void testIvoiceAdd() {

			
			Invoice inv1 = new Invoice(201,"Naveen", 6000);
			Invoice inv2 = new Invoice(202,"Vignesh", 6000);
			
			  
			
			service.addInvoice(inv1);
			
			Mockito.verify(repoMock, Mockito.times(1)).add(inv1);

			service.addInvoice(inv2);
						
			Mockito.verify(repoMock, Mockito.times(1)).add(inv2);


			
	       
	           
	           
			 
			  
		}

}
