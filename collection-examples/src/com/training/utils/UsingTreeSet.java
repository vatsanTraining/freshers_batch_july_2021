package com.training.utils;

import java.util.TreeSet;

import com.training.model.Customer;

public class UsingTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Customer ram = new Customer(101,"Ram","ram@abc.com");
		
		Customer anbu = new Customer(102,"Anbu","anb@abc.com");
		
		Customer tam = new Customer(103,"Tamil","tam@abc.com");
		
	
		Customer sentam = new Customer(103,"Tamil","tam@abc.com");
		
		TreeSet<Customer> list = new TreeSet();
		
		list.add(tam);
		list.add(ram);
		list.add(anbu);
		boolean result =list.add(sentam);
		
		System.out.println("Is Added :="+result);
		
		System.out.println(list);
		
		System.out.println(" Size ="+list.size());
		
		
	}

}
