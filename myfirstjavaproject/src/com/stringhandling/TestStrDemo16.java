package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str1 = sc.nextLine();

		char[] ach = str1.toCharArray();
//		for (int i = ach.length - 1; i >= 0; i--) {
//			System.out.print(ach[i]);
//		}

		int start = 0;// J
		int end = str1.length() - 1;// a
		char temp = 0;

		while (start < end) {
			temp = ach[start];
			ach[start] = ach[end];
			ach[end] = temp;
			start++;
			end--;
		}

		String rev = new String(ach);
		System.out.println(rev);

	}

}
