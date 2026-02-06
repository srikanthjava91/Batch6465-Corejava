package com.stringhandling;

import java.util.Arrays;

public class TestStrDemo26 {

	public static void main(String[] args) {

		String s1 = "Debit Card";
		String s2 = "Bad Credit";

		// Converting String to lowerCase
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		// Check two Strings are equal or not
		// if the two String are not equal it's not anangram
		if (s1.length() != s2.length()) {
			System.out.println("both are not anagrams !!");
			return;
		}

		// Converting String to Array of characters
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		// Sort the characters
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("The Given String is Anagram !!");
		} else {
			System.out.println("The Given String is not Anagram !!");
		}

	}

}
