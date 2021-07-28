package com.example.demo.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.mocks.Invoice;
import com.example.demo.mocks.InvoiceRepository;

public class InvoiceRepositoryMock implements InvoiceRepository {

	private int count;
	private Invoice inv;
	
	@Override
	public void add(Invoice invoice) {

		count++;
		this.inv=invoice;
	}
	
	public void verify(int callCount, Invoice invoice) {
		
		assertEquals(count, callCount);
		assertEquals(this.inv, invoice);
	}

}
