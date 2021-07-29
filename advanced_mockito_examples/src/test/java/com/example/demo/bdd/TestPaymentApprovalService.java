package com.example.demo.bdd;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.hamcrest.MockitoHamcrest.*;

import com.example.demo.ifaces.CardPayment;
import com.example.demo.services.PaymentApprovalService;
import static org.mockito.BDDMockito.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;
public class TestPaymentApprovalService {

	
	@Mock
	private CardPayment payment;
	
	@InjectMocks
	private PaymentApprovalService service;
	
	
	@BeforeEach
	public  void init() {
		
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	@Ignore
	public void testApplyForApprovalFailure() {
		
		
		given(payment.approve(1010,"grt jewellery")).willReturn(false);
		
				
	     boolean returnValue=	service.applyForApproval(7474, "grt jewellery");
		
		     
         // assertEquals(returnValue, false);
          
                   

    }
		
		@Test
	public void testApplyForApprovalSuccess() {
		
		fail("Not implemented");
	}
	
	
@Test		
 public void testForArgumentCapture() {
	 
	
	ArgumentCaptor<Long> captor1= 
            ArgumentCaptor.forClass(Long.class);

	  ArgumentCaptor<String> captor2= 
			            ArgumentCaptor.forClass(String.class);
	  
	 
	  given(payment.approve(1020,"ramesh hotel")).willReturn(true);
	  
	    
	    service.applyForApproval(1020,"ramesh hotel"); 
	    
	    then(payment)
	               .should(times(1))
	                   .approve(captor1.capture(),captor2.capture());  
	      System.out.println(captor1.getAllValues());
	      System.out.println(captor2.getAllValues());
	      
	   // assertEquals(captor1.getAllValues().size(),1);
	      assertEquals(captor1.getValue(),1020);
	    


 }
	
	
    @Test
	public void testWithAnswer() {
		
    	when(payment.approve(anyLong(),anyString())).thenAnswer(i -> 
    	        { 
    	        	return ((String)i.getArguments()[1]).length() ==3;
    	
    	        });

    	   service.applyForApproval(1020, "grt");
    	   
    	        assertEquals(true, service.applyForApproval(1020, "grt"));

    	
//    	        when(payment.approve(anyInt(),anyString())).thenAnswer(i -> 
//    	        { 
//    	        	return ((Long)i.getArguments()[0])>1000;
//    	
//    	        });

    	        
    	        
	}
	
}
