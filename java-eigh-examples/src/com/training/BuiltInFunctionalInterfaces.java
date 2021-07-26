package com.training;

import java.util.function.*;
import java.util.*;

public class BuiltInFunctionalInterfaces {

	public static void usingPredicate() {
		
		// If mark is greater that 70 pass else fail
		List<Integer> markList = Arrays.asList(43,56,22,78,89,19,99,100);
		
		// Traditional Java For-Each Loop
		for(Integer eachInteger: markList) {
			System.out.println(eachInteger);
		}
		
		// Using Consumer Lambda 
		markList.forEach((element) -> System.out.println(element));
		
		// Method Reference
		markList.forEach(System.out::println);
		
		
		
		
		}
	
	public static void main(String[] args) {

		
		usingPredicate();
	}

}
