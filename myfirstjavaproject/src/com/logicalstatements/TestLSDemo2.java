package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();// 17

		if (age >= 18) {
			System.out.println("You are Eligible for Voting ");
			System.out.println("You are Eligible for Driving ");
		} else {
			System.out.println("you are not eligible for voting");
			System.out.println("you are not eligible for Driving");
		}
		System.out.println("Hello");
		System.out.println("How are you !!");

		System.out.println("main method ended !!");

	}

}
