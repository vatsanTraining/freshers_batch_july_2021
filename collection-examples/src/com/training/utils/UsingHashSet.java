package com.training.utils;

import java.util.HashSet;

import com.training.model.Book;

public class UsingHashSet {

	public static void main(String[] args) {

		
		HashSet<Book> bookList = new HashSet<>();
		
		
		
		Book headFirst = new Book(101, "Head First Java", 490);
		
		Book spring = new Book(102, "Thinking Spring ", 950);
		
		Book angular = new Book(103, "Angular", 4595);
		
		Book js = new Book(103, "Angular", 4595);
		
		
		bookList.add(headFirst);
		bookList.add(spring);
		bookList.add(angular);
		
		bookList.add(js);
		
		
		
		System.out.println(bookList);
		
		
		
	}

}
