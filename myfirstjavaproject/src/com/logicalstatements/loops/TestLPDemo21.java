package com.logicalstatements.loops;

import java.util.Scanner;

//WAP to convert Decimal to Binary numbers.!
public class TestLPDemo21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = sc.nextInt();
		int r = 0;
		String s = "";
//		int arr[] = new int[127];
//		int i = 0;

		while (n != 0) {
			r = n % 2;
			n = n / 2;
//			arr[i] = r;
//			i++;
			s = r + s;
		}

		System.out.println(s);

//		for (int j = i - 1; j >= 0; j--) {
//			System.out.print(arr[j] + " ");
//		}

	}
}
