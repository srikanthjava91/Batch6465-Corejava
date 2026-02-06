package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to find the Given number is perfect or not ..?
//perfect number means : sum of the factors is equal to the given number excluding the given number.
//6 28 496 8128 are examples of perfect numbers
//input = 6 
//output = sum of the factors(1 + 2 + 3) = 6 --> true --> the given number is perfect 
public class TestLPDemo5 {

	static boolean isPerfect(int num) {
		boolean status = false;
		int sum = 0;

		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == num) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check factors : ");
		int n = sc.nextInt();// 25

		boolean status = isPerfect(n);

		if (status) {
			System.out.println("The given number is perfect ");
		} else {
			System.out.println("The given number is not a  perfect ");
		}

	}

}
