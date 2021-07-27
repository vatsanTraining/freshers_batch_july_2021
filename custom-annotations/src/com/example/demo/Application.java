package com.example.demo;

import com.example.demo.stereotypes.MyTable;

public class Application {

	public static void main(String[] args) {

		
		Student ram = new Student();
		
		Class<?> clsRef = ram.getClass();
		
		MyTable annotRef=  clsRef.getAnnotation(MyTable.class);
		
		                 
		  String tableName =     annotRef.name();
		  
		  String sql = "insert into " +tableName + " values(101,202,30)";
		  
		  System.out.println(sql);
	}

}
