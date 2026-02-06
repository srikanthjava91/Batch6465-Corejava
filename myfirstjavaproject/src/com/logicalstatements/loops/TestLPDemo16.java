package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo16 {

	int findDigitSum(int n) {
		int sum = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		return sum;
	}

	void main() {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();// 456

		int sum = findDigitSum(n);
		System.out.println("sum of the digits : " + sum);
	}

}
