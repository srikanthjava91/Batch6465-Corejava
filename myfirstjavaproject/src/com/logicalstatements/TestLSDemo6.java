package com.logicalstatements;

import java.util.Scanner;

//Q) WAP to print Cricketer Name Based on the Jersey Number ..? 
public class TestLSDemo6 {

	public static void main(String[] args) {
		System.out.println("main methgod started !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Jersey Number: ");
		int jno = sc.nextInt();

		switch (jno) {
		case 4 -> System.out.println("Abhishek Sharma ");
		case 72 -> System.out.println("Tilak Varma ");
		case 77 -> System.out.println("Shubman Gill");
		default -> System.out.println("Unknown !!");
		}
	}
}
