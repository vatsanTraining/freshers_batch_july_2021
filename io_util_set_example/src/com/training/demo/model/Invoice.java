package com.training.demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Invoice {

	int invoiceNumber;
	String customerName;
	double amount;
	@Override
	public String toString() {
		return invoiceNumber + ","+ customerName+ "," +amount;
		
	}
	
	
	
}
