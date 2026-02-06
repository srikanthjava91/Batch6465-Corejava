package com.logicalstatements;

import java.util.Scanner;

//if else 
public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

//		int i = 10;
//		Integer i1 = 20;
//		System.out.println(i instanceof int);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some number:");
		int time = sc.nextInt();

		if (time <= 8) {
			System.out.println("Hello Good morning ");
			System.out.println("Hello Good evening ");
		}

		System.out.println("main method ended !!");

	}

}
