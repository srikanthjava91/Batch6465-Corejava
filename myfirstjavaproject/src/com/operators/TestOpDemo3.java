package com.operators;

//Comparison Operators --> All Comparison operators will give boolean expression
//== != < <= > >= 

//== operator works for Primitive data type to check the values.BUt
//++ operators works for Object data types to check address of the objects.

//If we want to compare Strings, we must need to use .equals() method 

//Note : .equals() method is always checks for content comparison 
//where as == methods always checks for the addresses comparison 
public class TestOpDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		// String Literals
		String s1 = "Srikanth";
		String s2 = "Srikanth";
		String s4 = "Srikanth";

		// String Object
		String s3 = new String("Srikanth");
		String s5 = new String("Srikanth");
		System.out.println(s1 == s2);// true
		System.out.println(s2 == s3);// false
		System.out.println(s2 == s4);
		System.out.println(s3 == s5);

		System.out.println("****char bool**************");
		char c1 = 'A';
		char c2 = 'A';
		System.out.println(c1 == c2);

		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1 == b2);

		System.out.println("****int**************");
		int a = 100;
		int x = 200;
		int b = 100;
		System.out.println(a == x);// false
		System.out.println(a != x);// true

		System.out.println(a < x);// true
		System.out.println(a <= x);// true
		System.out.println(a <= b);// true

		System.out.println(a > x);// false
		System.out.println(a >= b);// true
		System.out.println(a >= x);// false

	}
}
