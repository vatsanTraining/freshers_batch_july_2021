package com.training.demo.utils;
import java.sql.*;
public class SqlConnection {

	
	public static Connection getMySqlConnection() {
		
		Connection con = null;
		
		Object o;
		
		try {
		
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
			
			   
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", 
					            "root", "srivatsan");
			
		} catch (SQLException  e) {
			
			e.printStackTrace();
		}
				
		return con;
	}
}
