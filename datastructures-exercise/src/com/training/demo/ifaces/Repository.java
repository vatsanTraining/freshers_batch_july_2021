package com.training.demo.ifaces;
import java.util.*;

import com.training.demo.model.Invoice;
//public interface InvoiceRepository {
//
//	
//	
//	 List<Invoice> getAllInovices();
//	 boolean addInvoice(Invoice inv);
//	
//}

public interface Repository<T> {

	
	
	 List<T> getAll();
	 boolean add(T t);
	
}
