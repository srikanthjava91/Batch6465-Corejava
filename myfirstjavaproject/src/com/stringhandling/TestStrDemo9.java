package com.stringhandling;

//A-z --> 65 to 90 
//a-z --> 97 to 122
public class TestStrDemo9 {

	public static void main(String[] args) {
		String str = "Srikanth";
		System.out.println(str.codePointAt(2));
		System.out.println(str.codePointBefore(2));
		System.out.println(str.codePointCount(2, 5));// i, n

		String str1 = "Advaith";// 100
		String str2 = "Abhigna";// 98
		System.out.println(str1.compareTo(str2));// 2

		String str3 = "Java";// 74
		String str4 = "java";// 106
		System.out.println(str3.compareTo(str4));// -32
		System.out.println(str3.compareToIgnoreCase(str4));

		String str5 = "Srikanth";
		String str6 = "Srikanth java";
		System.out.println(str5.compareTo(str6));
	}
}
