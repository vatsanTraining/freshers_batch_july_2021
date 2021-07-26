package com.training.demo.services;
import java.util.*;

import com.training.demo.model.Invoice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.*;
@Setter
@Getter
@ToString
public class FileHandlingService {

	
	private Set<Invoice> invoiceList;

	public FileHandlingService(Set<Invoice> invoiceList) {
		super();
		this.invoiceList = invoiceList;
	}
	

	public boolean writeToFile(String fileName) throws IOException {
		
		
		PrintWriter out = 
				new PrintWriter(new FileWriter(new File(fileName), true));
		
		for(Invoice eachInvoice:invoiceList) {
			
			out.println(eachInvoice);
		}
		
		 out.close();
		
	    return true;
	
	}
	
	
}
