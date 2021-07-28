package com.example.demo.stub;

import java.util.Collection;
import java.util.List;

public interface InvoiceRepository {

	List<Invoice> findAllByAmountGt(double amount);

}
