package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo20 {

	public static void main(String[] args) {
		System.out.println("man method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();// 153
		String strN = Integer.toString(n);
		int digitCount = strN.length();
		System.out.println(digitCount);

		int sumP = 0;
		int r = 0;
		int temp = n;

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sumP = (int) (sumP + Math.pow(r, digitCount));
		}

		if (temp == sumP) {
			System.out.println("Yes It's ArmStrong");
		} else {
			System.out.println("No It's not an ArmStrong");
		}
		sc.close();
	}
}
