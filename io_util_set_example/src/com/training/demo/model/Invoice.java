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
public class Invoice implements Comparable<Invoice>{

	int invoiceNumber;
	String customerName;
	double amount;
	@Override
	public String toString() {
		return invoiceNumber + ","+ customerName+ "," +amount;
		
	}
	@Override
	public int compareTo(Invoice o) {
		
		if(this.invoiceNumber<o.invoiceNumber) return 1;
		if(this.invoiceNumber>o.invoiceNumber) return -1;
		return 0;
	}
	
	
	
}
