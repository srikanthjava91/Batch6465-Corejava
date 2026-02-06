package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo18 {

	boolean isPalin(int n, int rev) {
		if (n == rev) {
			return true;
		}
		return false;
	}

	int findReverse(int n) {//// 456
		int rev = 0;
		int r = 0;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}

		return rev;
	}

	void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();// 456
		int rev = findReverse(n);
		System.out.println("Reverse number of agiven number: " + rev);

		boolean status = isPalin(n, rev);

		if (status) {
			System.out.println("The given number is Palindrome !");
		} else {
			System.out.println("The Given number is not a Palnidrome !");
		}

	}

}
