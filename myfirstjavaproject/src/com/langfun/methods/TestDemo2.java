package com.langfun.methods;

//method with no return type + with arguments
//WAP for calculate two values from a methods with Arithmetic operators.

//byte --> short -> int --> long --> float --> double 
public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		// Call by value
		addition(100, 300);
		subtraction(500, 200);
		multiplication(10, 25.5);
		division(190, 7);
		modulus(9, 2);

		getName("Srikanth");
		System.out.println("main method ended ");
	}

	static void getName(String name) {
		System.out.println("Student name :" + name);
	}

	static void modulus(double x, double y) {
		System.out.println("in modulus ");
		System.out.println(x % y);// reminder
	}

	static void division(int a, int b) {
		System.out.println("In Division ");
		System.out.println(a / b);// --> Quotient

	}

	static void multiplication(int a, double b) {
		System.out.println("hello multiplication ");
		System.out.println(b * a);
	}

	static void subtraction(long a, long b) {
		System.out.println("Hello subtraction !!");
		System.out.println(a - b);
	}

	static void addition(int i, int j) {
		System.out.println("hello adidition ");
		System.out.println(i + j);
	}

}
