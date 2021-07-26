package com.training.demo.services;
import java.util.*;

import com.training.demo.ifaces.Repository;
import com.training.demo.model.Invoice;
public class InvoiceRepositoryImplemetation implements Repository<Invoice> {

	private List<Invoice> invoiceList;
	
	
	public InvoiceRepositoryImplemetation() {
		super();
		
		invoiceList= new ArrayList<>();

	}

	@Override
	public List<Invoice> getAll() {
		return this.invoiceList;
	}

	@Override
	public boolean add(Invoice t) {
		return this.invoiceList.add(t);
	}

}
