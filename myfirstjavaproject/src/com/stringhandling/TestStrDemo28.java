package com.stringhandling;

import java.util.Scanner;

public class TestStrDemo28 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String :");
		String str = sc.nextLine();//
		str = str.toLowerCase();
		char[] ach = str.toCharArray();

		int letterCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;
		int vowelsCount = 0;
		int consonantsCount =0;

		for (char c : ach) {
			
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelsCount++;
				break;
			default : consonantsCount++;
				
			}
			
//			if (Character.isLetter(c)) {
//				letterCount++;
//				
//				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//					vowelsCount++;
//				} else {
//					consonantsCount++;
//				}
//				
//			} else if (Character.isDigit(c)) {
//				digitCount++;
//			} else {
//				specialCharCount++;
//			}
		}
		
		System.out.println("Letter Count : " + letterCount);
		System.out.println("Vowels Count : " + vowelsCount);
		System.out.println("consonants count : " + consonantsCount);
		System.out.println("Digit Count : " + digitCount);
		System.out.println("Speial Charcater Count : " + specialCharCount);
		
	}

}
