package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print sum of the Given number. 
//input : 456
//output : 15

public class TestLpDemo15 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();// 456
		int sum = 0;
		int r = 0;

		while (n != 0) {
			r = n % 10;// 456 % 10 -> 6, 45%10-> 5,4%10-> 4
			n = n / 10;// 456/10 -> 45, 45/10 -> 4,4/10 -> 0
			sum = sum + r;
		}

		System.out.println("Sum of the digits is : " + sum);

	}

}
