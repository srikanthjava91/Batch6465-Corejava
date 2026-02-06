package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestExDemo14 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
//		Step1: Loading the Driver class 
//		Returns the Class object associated with the class or interface with the given string name.
//		Reflection API : Loading classes from Secondary memory to primary memory.
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class has been loaded successfully !!");
//		Step2: Establish the Connection to SQL
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdata", "root", "root");
			System.out.println("Successfully connected to the DB");

//		Step3: Create a Statement Object to communicate with SQL 
//		Creates a Statement object for sending SQL statements to the database.
			stmt = con.createStatement();

//		Step4 : Create a ResultSet to Read the data from SQl 
			String sql = "select * from students";
			rs = stmt.executeQuery(sql);

//		Moves the cursor forward one row from its current position.
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println("**************************");
			}

//		Step5 : Closing the connections.
		} finally {
			rs.close();
			stmt.close();
			con.close();
		}

		System.out.println("main method ended !");

	}

}
