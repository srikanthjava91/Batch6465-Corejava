package com.langfun.methods;

import java.util.Scanner;

public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		// The constructor Scanner() is undefined
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Age :" + age);

		sc.nextLine();
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		
		System.out.println("Enter your branch details : ");
		String branch = sc.nextLine();
		System.out.println("main method ended ");
	}

}
