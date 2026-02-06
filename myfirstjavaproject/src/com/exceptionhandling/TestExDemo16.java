package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo16 {

	public static void main(String[] args) throws PreethamException {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");

		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible for Driving or Voting or Marriage !");
		}else {
			throw new PreethamException("Arey babu niku inka time undi ra !!");
		}

	}

}
