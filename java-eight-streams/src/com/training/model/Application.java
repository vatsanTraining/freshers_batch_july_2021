package com.training.model;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import java.util.*;
public class Application {

	
	public static void print(List<?> list) {
		
		
		list.forEach(System.out::println);
	}
	public static void main(String[] args) {

		
		Book headFirst = new Book(101,"Head first java", 45.00);
		Book spring = new Book(102,"Professional Spring", 145.00);
		Book html = new Book(201,"HTML for dummies", 345.00);
		
	    List<Book> bookList = Arrays.asList(headFirst,spring,html);
	    
	    
	    
	    bookList.stream().filter(e -> e.getRatePerUnit()>300).forEach(System.out::println);
	    
	}

}
// max

