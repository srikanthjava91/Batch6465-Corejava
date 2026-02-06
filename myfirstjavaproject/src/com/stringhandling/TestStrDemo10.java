package com.stringhandling;

public class TestStrDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		String str = "Srikanth";
		String str1 = "Java";
		int i1 = 9189;
		System.out.println(str + str1 + i1 + false);// SrikanthJava9189
		System.out.println(str.concat(str1).concat("Hello"));// SrikanthJava
	}

}
