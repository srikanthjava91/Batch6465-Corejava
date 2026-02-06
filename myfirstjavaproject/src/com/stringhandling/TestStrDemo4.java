package com.stringhandling;

//Strings are Immutable 
public class TestStrDemo4 {

	public static void main(String[] args) {

		String str1 = "Sachin";
		String str2 = "Tendulkar";
		System.out.println(str1.concat(str2));//SachinTendulkar

		String s1 = "Rohit";
		String s2 = "Sharma";
		s1.concat(s2);
		System.out.println(s1);// Rohit
		System.out.println(s2);//Sharma

		String s3 = "Srikanth";
		String s4 = "Java";
		s3 = s3.concat(s4);
		System.out.println(s3);//SrikanthJava
	}
}
