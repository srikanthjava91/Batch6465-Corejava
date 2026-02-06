package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo7 {

	public static void main(String[] args) {
		System.out.println("main methgod started !");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n1 = sc.nextInt();

		System.out.println("Enter another number ");
		int n2 = sc.nextInt();

		System.out.println("Enter a symbol to proceed like + - * % / ");
		String symb = sc.next();

		switch (symb) {
		case "+":
			System.out.println("Addition of two numbers ");
			System.out.println(n1 + n2);
			break;
		case "-":
			System.out.println("Subtraction of two numbers " + (n1 - n2));
			break;
		case "*":
			System.out.println("Multiplicaion of two numbers " + (n1 * n2));
			break;
		case "%":
			System.out.println("Modulus of two numbers " + (n1 % n2));
			break;
		case "/":
			System.out.println("Division of two numbers " + (n1 / n2));
			break;
		default:
			System.out.println("Invalid symbol to proceed !");

		}

	}

}
