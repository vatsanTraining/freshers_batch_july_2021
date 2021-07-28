package com.example.demo.dummy;

import java.util.Collection;

public interface InvoiceRepository {

	void add(Invoice invoice);
	Collection<Invoice> findAll();
}
