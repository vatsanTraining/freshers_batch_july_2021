package com.training.demo.services;
import java.io.PrintWriter;
import java.util.*;

import com.training.demo.ifaces.Repository;
import com.training.demo.model.Invoice;
public class InvoiceRepositoryImplemetation implements Repository<Invoice> {

	private Set<Invoice> invoiceList;
	
	
	public InvoiceRepositoryImplemetation() {
		super();
		
		invoiceList= new HashSet<>();

	}

	@Override
	public Set<Invoice> getAll() {
		return this.invoiceList;
	}

	@Override
	public boolean add(Invoice t) {
		return this.invoiceList.add(t);
	}
	

}
