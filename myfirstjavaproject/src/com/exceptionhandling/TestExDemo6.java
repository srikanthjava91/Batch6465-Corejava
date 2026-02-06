package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter your age ");
			int age = sc.nextInt();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println("Enter a name : ");
		sc.next();
		String s = sc.next();// 8

		try {
			System.out.println(s.charAt(10));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		System.out.println("main method ended ");
	}

}
