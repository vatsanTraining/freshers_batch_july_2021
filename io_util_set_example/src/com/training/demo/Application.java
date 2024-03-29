package com.training.demo;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.training.demo.ifaces.Repository;
import com.training.demo.model.Invoice;
import com.training.demo.services.FileHandlingService;
import com.training.demo.services.InvoiceRepositoryImplemetation;

public class Application {

	public static void printElements(Collection<?> collection) {
		
		Collection<Invoice> invCollection = (Collection<Invoice>) collection;
		
//		for(Invoice eachInvoice: invCollection) {
//			
//			System.out.println(eachInvoice);
//		}
		
		 invCollection.forEach(System.out::println);
		 
	}
	
	




	public static void main(String[] args) {

		
		Repository<Invoice> repo =
				   new InvoiceRepositoryImplemetation();
		
		Invoice ram = new Invoice(101, "Ramesh",75757);
		Invoice nikil = new Invoice(102, "Nikhil",9000);
		
		 System.out.println("Element Added :="+repo.add(ram));
		 
		 System.out.println("Element Added :="+repo.add(nikil));
		 
		 
		 Set<Invoice> list = (Set<Invoice>) repo.getAll();
		 
		 FileHandlingService service = new FileHandlingService(list);
		 
		  try {
			System.out.println("File Created :="+service.writeToFile("invoice.csv"));
	
			  Set<Invoice> invList= service.readFromFile("invoice.csv");
			  printElements(invList);
		  
		  } catch (IOException e) {
			e.printStackTrace();
		}
		  
		 
		// printElements(list);
		 
	}

}
