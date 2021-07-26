package com.training.demo.repos;

import java.util.*;


public interface Repository<T> {
	
	 Collection<T> findAll();
	 boolean add(T t);
	
}
