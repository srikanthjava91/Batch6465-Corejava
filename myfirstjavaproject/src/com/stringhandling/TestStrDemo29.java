package com.stringhandling;

public class TestStrDemo29 {

	public static void main(String[] args) {

		String s = "        Good morning Have a nice day     ";
		System.out.println(s);
		System.out.println(s.trim());

		String s1 = "       Srikanth Java in Vcube Software Solutions     ";
		System.out.println(s1.replace('i', 'e'));
		System.out.println(s1.replace("So", "Soooooooooo"));
		System.out.println(s1.replaceAll("So", "Hooooo"));

		String s2 = "Mock interviews are the 173 Game changers at 500072";
		System.out.println(s2.replaceAll("\\d", "1"));

		String s3 = "Weekly Tests are mandotary";
		System.out.println(s3.replaceAll("\\s", ""));

		String s4 = "Good morning Good day Good  Batch 64 & 65 ";
		System.out.println(s4.replaceFirst("Good", "Super"));

	}
}
