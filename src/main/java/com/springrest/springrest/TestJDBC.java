package com.springrest.springrest;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class TestJDBC {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:postgresql://localhost:5432/courses_gradle?useSSL=false" ;
		String user = "sparshsingh";
		String pass = "";
		
		
		try {
			
			System.out.println("Connecting to the database" + jdbcUrl);
			
			Connection myCon = DriverManager.getConnection(jdbcUrl, user, pass) ; 
			
			System.out.println("Connection successful");
			
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
		
	}

}
