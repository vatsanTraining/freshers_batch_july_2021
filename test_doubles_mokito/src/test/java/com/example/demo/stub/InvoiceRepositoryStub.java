package com.example.demo.stub;

import java.util.Arrays;
import java.util.List;

public class InvoiceRepositoryStub implements InvoiceRepository {

	@Override
	public List<Invoice> findAllByAmountGt(double amount) {
		
		return Arrays.asList(new Invoice(709,"Vikas",7000),new Invoice(710,"uma",6000));
		
	}
}
