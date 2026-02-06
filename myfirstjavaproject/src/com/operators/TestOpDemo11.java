package com.operators;

import java.util.Scanner;

//Ternary Operators Demo 
public class TestOpDemo11 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int a = sc.nextInt();// 100

		System.out.println("Enter b value :");
		int b = sc.nextInt();// 500
		int max = 0;

		max = (a > b) ? a : b;

		System.out.println("max value is : " + max);

	}

}
