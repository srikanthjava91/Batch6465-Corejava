package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo19 {

	public static void main(String[] args) {
		System.out.println("man method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();// 153
		int temp = n;
		int r = 0;
		int sumP = 0;

		while (n != 0) {
			r = n % 10;// 3 5 1
			n = n / 10;// 15 1 0
			sumP = sumP + r * r * r *r;// 27 +125 + 1 = 153
		}

		if (temp == sumP) {
			System.out.println("The given number is Armstrong number !");
		} else {
			System.out.println("The given number is not an Armstrong number !");
		}
		sc.close();
	}
}
