package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo8 {

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

		case "+", "add" -> {
			System.out.println("Additon of two numbers : ");
			System.out.println(n1 + n2);
		}
		case "-", "sub" -> System.out.println("subtraction of two numbers : " + (n1 - n2));
		case "*", "mul" -> System.out.println("Multiplication of two numbers : " + (n1 * n2));
		case "%", "mod" -> System.out.println("Reminder of two numbers : " + (n1 % n2));
		case "/", "div" -> System.out.println("Quotient of two numbers : " + (n1 / n2));
		default -> System.out.println("Invalid symbol ");

		}

	}

}
