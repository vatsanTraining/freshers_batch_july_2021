package com.example.demo.fake;

import java.util.Collection;
import java.util.*;

// This is a Lightweight Implementation of the Real Invoice Repository
// Which may connected a Production Database
public class FakeInvoiceRepository implements InvoiceRepository {

	HashMap<Integer, Invoice> dataStore = new HashMap<>();
	
	
	@Override
	public void add(Invoice invoice) {

		 dataStore.put(invoice.getInvoiceNumber(), invoice);
	}

	@Override
	public Collection<Invoice> findAll() {

		return dataStore.values();
	}

}
