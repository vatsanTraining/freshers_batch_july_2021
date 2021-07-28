package com.example.demo.fake;

import java.util.Collection;

public interface InvoiceRepository {

	void add(Invoice invoice);
	Collection<Invoice> findAll();
}
