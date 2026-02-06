package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to find Factors of a Given number.? 
//input : 6 
//output : 1 2 3 = 6 

//input : 14 
//output : 1 2 7 != 14 

//input : 28 
//output : 1 2 4 7 14 = 28 

//Note : A factor of a number is a number that divides the given number 
//evenly or exactly, leaving no remainder. 
public class TestLPDemo3 {

	public static void main(String[] args) {
		System.out.println("main method strated !");
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check factors : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			// 6 % 1 == 0
			// 6 % 2 == 0
			// 6 % 3 == 0
			// 6 % 4 == 2 --> false
			// 6 % 5 == 1 --> false
			// 6 % 6 == 0
			if (n % i == 0) {
				System.out.println(i);// 1 2 3
			}

		}

	}

}
