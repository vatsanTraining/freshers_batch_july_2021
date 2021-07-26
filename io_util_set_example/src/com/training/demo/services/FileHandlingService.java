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
	
	
	public Set<Invoice> readFromFile(String fileName) throws IOException{
		
	//	Set<Invoice> invoiceList = new HashSet<Invoice>();
		
		Set<Invoice> invoiceList = new TreeSet<Invoice>();
		
		
		BufferedReader reader = 
				      new BufferedReader(new FileReader(new File(fileName)));
		
		
		String line;
		
		 while( (line=reader.readLine())!=null) {
			 
			 String[] values= line.split(",");
			 
			 Invoice inv = new Invoice(Integer.parseInt(values[0]), 
					            values[1], Double.parseDouble(values[2]));
					 
					 invoiceList.add(inv);
		 }
		
		return invoiceList;
	}
	
}
