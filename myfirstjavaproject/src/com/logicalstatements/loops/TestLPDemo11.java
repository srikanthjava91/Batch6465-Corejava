package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo11 {

	static boolean isPrime(int n) {
		boolean status = true;
		if (n == 1) {
			return false;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					status = false;
					break;
				}
			}
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("up to where you want to print prime numbers : ");
		int n = sc.nextInt();//

		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
