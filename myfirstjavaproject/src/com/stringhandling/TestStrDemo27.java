package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo27 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String :");
		String str = sc.nextLine();//
		str = str.toLowerCase();
		char[] ach = str.toCharArray();

		int vowelsCount = 0;
		int consonantsCount = 0;

		for (char c : ach) {
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowelsCount++;
				} else {
					consonantsCount++;
				}

			} else {

			}
		}

		System.out.println("Vowels Count : " + vowelsCount);
		System.out.println("Consonants count : " + consonantsCount);

		System.out.println("main method ended ");
	}

}
