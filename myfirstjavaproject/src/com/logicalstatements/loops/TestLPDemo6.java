package com.logicalstatements.loops;

import java.util.Scanner;

// WAP to print Math table ..? 
// input : 9 and 20
// output :
// 9 * 1 = 9 
// 9 * 2 = 18 
// 9 * 3 = 27 
//----------
//9 * 20 = 180 
public class TestLPDemo6 {

	void main() {
		System.out.println("main method strated Test6");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();

		System.out.println("up to where you want to print");
		int end = sc.nextInt();

		for (int i = 1; i <= end; i++) {
			System.out.println(n + " X " + i + " = " + n * i);
		}
		sc.close();
	}

}
