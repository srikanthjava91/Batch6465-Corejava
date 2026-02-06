package com.operators;

import java.util.Scanner;

public class TestOPDemo12 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();// 100
		String eligibility = "";
		System.out.println("Enter your country name");
		String nationality = sc.next();

		eligibility = (age >= 18 && nationality.equals("India")) ? "Yes " : "NO";

		System.out.println("is the given age is elibile or not ? " + eligibility);

	}

}
