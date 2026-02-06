package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo4 {

	static void findFactors(int num) {
		System.out.println("Inside Find factors ");
		for (long i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check factors : ");
		int n = sc.nextInt();// 6
		findFactors(n);
	}
}
