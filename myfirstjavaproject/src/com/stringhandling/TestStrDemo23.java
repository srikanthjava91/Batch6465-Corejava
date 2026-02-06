package com.stringhandling;

public class TestStrDemo23 {

	public static void main(String[] args) {

		String str1 = "Srikanth";
		String str2 = "Java";
		String str3 = "Vcube";
		String str4 = "Java is simple";
		String nstr = String.join(",", str1, str2, str3, str4, "Hello", "Good morning");
		System.out.println(nstr);
	}
}
