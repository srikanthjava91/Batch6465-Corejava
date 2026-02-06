package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to print the reverse number of a given number.
//input 321 
//output : 123
public class TestLPDemo17 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();// 456
		int rev = 0;
		int r = 0;
		int temp = n;

		while (n != 0) {
			r = n % 10;// 456%10-> 6, 45%10-> 5, 4%10-> 4
			n = n / 10;// 456/10 -> 45, 45/10 -> 4, 4/10 -> 0
			rev = rev * 10 + r;// 654
		}

		System.out.println("Reverse number of a given number : " + rev);

		if (rev == temp) {
			System.out.println("The given number is Palindrome ");
		} else {
			System.out.println("The given number is not a Palindrome ");
		}

	}

}
