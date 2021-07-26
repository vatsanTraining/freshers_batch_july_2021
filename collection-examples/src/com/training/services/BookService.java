package com.training.services;

import java.util.Collection;

import com.training.ifaces.DataAccess;
import com.training.model.Book;

public class BookService implements DataAccess<Book> {

	@Override
	public boolean add(Book t) {
		return false;
	}

	
	@Override
	public Collection<Book> get() {
		return null;
	}

}
