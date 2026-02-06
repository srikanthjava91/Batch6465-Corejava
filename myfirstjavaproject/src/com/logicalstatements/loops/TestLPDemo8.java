package com.logicalstatements.loops;

//Q) WAP to print factorial of given number using recursion ..?
import java.util.Scanner;

public class TestLPDemo8 {

	static int findFactorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		return n * findFactorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("main method strated from Test 7");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		long factorialNum = findFactorial(n);
		System.out.println("Factorial number of a given number is : " + factorialNum);
		sc.close();
	}

}
