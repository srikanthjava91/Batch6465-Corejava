package com.operators;

import java.util.Scanner;

//Arithmetic Operators  + - * % /
public class TestOPDemo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();// 95

		System.out.println("Enter b number : ");
		int b = sc.nextInt();// 7

		// BODMAS
		System.out.println("Addition of two number : " + (a + b));// 1020

		// The operator - is undefined for the argument type(s) String, int
//		System.out.println("Difference of two numbers :" + a-b);//
		System.out.println("Difference of Two numbers :" + (b - a));
		System.out.println("Product of two numbers : " + a * b);//

//		 95%7 --> 7)95(13
//					 91
//		            ----
//					4
		System.out.println("Reminder of two numbers : " + a % b);// 4
		System.out.println("Quotient of Two numbers : " + a / b);// 13

	}

}
