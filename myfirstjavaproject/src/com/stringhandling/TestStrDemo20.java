package com.stringhandling;

public class TestStrDemo20 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		String s1 = "Java";
		String s2 = new String("Java");
//		s2 = s2.intern();
		s1 = s1.intern();
		System.out.println(s1 == s2);
	}
}
