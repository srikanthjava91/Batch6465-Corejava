package com.stringhandling;

public class TestStrDemo3 {

	public static void main(String[] args) {

		String s1 = "Virat";
		String s2 = "Kohli";
		// Runtime concatenation
		String s3 = s1 + s2;////s3 → new object in heap
		System.out.println(s3);
		String s4 = "ViratKohli";// s4 → existing object in SCP --> 1
		System.out.println(s3 == s4);

		// Re-assigning
		String s6 = new String("Java");
		String s5 = s6;
		System.out.println(s5);
		System.out.println(s4 == s5);

	}
}
