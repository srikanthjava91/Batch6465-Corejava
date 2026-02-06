package com.stringhandling;

import java.util.Scanner;

//WAP to print a Reverse String from a given String.
//WAP to find the given String is a Palindrome or not ..? 
public class TestStrDemo8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.next();// Java --> avaj --> 0 1 2 3

		String rstr = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			rstr = c + rstr;// -->Ja
		}

		System.out.println("Reverse String of a Givebn String is : " + rstr);

		if (s.equalsIgnoreCase(rstr)) {
			System.out.println("The Given String is Palindrome !");
		} else {
			System.out.println("The Given String is not a palindrome !!");
		}

	}

}
