package com.javaintro;

//Static related information 
public class TestDemo3 {

//	static variables 
//	Declaration and initialization 
	static int id = 1;
	static String name = "Vcube";

	// Block
	static {
		System.out.println("Hello static Block !");
	}

	// main method
	public static void main(String[] args) {
		System.out.println("main method started ");

		// Accessing static data
		System.out.println(id);// 1
		System.out.println(name);// Vcube
	}

}
