package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo1 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		System.out.println("Enter b number : ");
		int b = sc.nextInt();

		try {
			System.out.println("in try");
			System.out.println(a / b);
		} catch (ArithmeticException ae) {
			System.err.println("in catch");
			ae.printStackTrace();
		}

		System.out.println("Hello ");
		System.out.println("main method ended ");

	}

}
