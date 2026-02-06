package com.langfun.methods;

import java.util.Scanner;

//method with return type + with no arguments.
public class TestDemo6 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started !");
		double add = addition();
		double sub = subtraction();

		System.out.println(add * sub);
	}

	static float subtraction() {

		System.out.println("Enter a number ");
		int a = sc.nextInt();

		System.out.println("Enter b number ");
		float b = sc.nextFloat();
		float diff = b - a;
		return diff;
	}

	static double addition() {
		System.out.println("Enter a number ");
		int a = sc.nextInt();

		System.out.println("Enter b number ");
		int b = sc.nextInt();
		int sum = a + b;
		return sum;
	}

}
