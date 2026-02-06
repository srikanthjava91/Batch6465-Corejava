package com.stringhandling;

public class TestStrDemo12 {

	public static void main(String[] args) {
		String str1 = "Vcube";
		String str2 = "Java";

		System.out.println(str1.contentEquals("Vcube"));// true
		System.out.println(str2.contentEquals("java"));// false

		char[] ch = { 's', 'r', 'i', 'k', 'a', 'n', 't', 'h' };
		String str3 = new String(ch);
		String str = String.copyValueOf(ch);
		String str4 = String.valueOf(ch);
		
		System.out.println();
		System.out.println(str);
		System.out.println(str3);
		System.out.println(str4);
	}
}
