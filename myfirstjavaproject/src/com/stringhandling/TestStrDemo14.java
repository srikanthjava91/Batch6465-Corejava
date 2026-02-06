package com.stringhandling;

import java.util.Scanner;

//equals vs equalsIgnorecase
public class TestStrDemo14 {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Login page ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Username :");
		String uname = sc.next();
		
		System.out.println("Enter your password ");
		String password = sc.next();
		
		if(uname.equalsIgnoreCase("admin") && password.equals("Admin12345")) {
			System.out.println("Welome to Home page " + uname);
		}else {
			System.err.println("Invalid user credentials !!");
		}

	}
}
