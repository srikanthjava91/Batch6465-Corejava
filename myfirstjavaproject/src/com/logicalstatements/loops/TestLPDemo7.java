package com.logicalstatements.loops;

import java.util.Scanner;

//Q) WAP to print factorial of given number using for ..?
//input = 5 
//output = 5 * 4 * 3 * 2 * 1 = 120 
public class TestLPDemo7 {

	static long findFactorial(int n) {
		long fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;// 120
		}
		return fact;
	}

	void main() {
		System.out.println("main method strated from Test 7");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();

		long factorialNum = findFactorial(n);
		System.out.println("Factorial number of a given number is : " + factorialNum);
		sc.close();
	}

}
