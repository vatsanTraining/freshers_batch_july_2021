package com.training.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;import java.util.TooManyListenersException;
import java.util.stream.Collectors;

import com.training.demo.ifaces.Repository;
import com.training.demo.model.Invoice;
import com.training.demo.services.InvoiceRepositoryImplemetation;

public class Application {

	public static void printElements(Collection<?> collection) {
		
		Collection<Invoice> invCollection = (Collection<Invoice>) collection;
		
		for(Invoice eachInvoice: invCollection) {
			
			System.out.println(eachInvoice);
		}
	}
	
	




	public static void main(String[] args) {

		
		Repository<Invoice> repo =
				   new InvoiceRepositoryImplemetation();
		
		Invoice ram = new Invoice(101, "Ramesh",75757);
		Invoice nikil = new Invoice(102, "Nikhil",9000);
		
		 System.out.println("Element Added :="+repo.add(ram));
		 
		 System.out.println("Element Added :="+repo.add(nikil));
		 
		 
		 List<Invoice> list = repo.getAll();
		 
		  
		  
		  
		 printElements(list);
		 
	}

}
