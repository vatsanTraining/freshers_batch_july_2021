package com.training.demo;

import java.sql.Connection;

import com.trainig.demo.entity.CabDriver;
import com.training.demo.repos.CabDriverRepoImpl;
import com.training.demo.repos.Repository;
import com.training.demo.utils.SqlConnection;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Connection con =SqlConnection.getMySqlConnection();
		
		
		CabDriver driver = new CabDriver(102, "naveen", 4.7);
		
		Repository<CabDriver> repo = new CabDriverRepoImpl(con);
		
		//System.out.println("Is Added:="+repo.add(driver));
		
		 repo.findAll().forEach(System.out::println);
		 
	}

}
