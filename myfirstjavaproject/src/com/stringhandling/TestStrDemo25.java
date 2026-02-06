package com.stringhandling;

public class TestStrDemo25 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		String s1 = "Java is simple";
//		beginIndex the beginning index, inclusive.
//		endIndex the ending index, exclusive.
		System.out.println(s1.substring(5));// is simple
		System.out.println(s1.substring(0, 5));// Jav
		
		System.out.println(s1.subSequence(0, 5));//Java

	}

}
