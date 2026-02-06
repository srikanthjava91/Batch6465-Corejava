package com.stringhandling;

public class TestStrDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		String s1 = "Java";// String constant Pool --> 1 Object
		String s2 = "Java";// 0
		String s3 = "Java";// 0

		s3 = "Srikanth";
		System.out.println(s1);// Java
		System.out.println(s2);// Java
		System.out.println(s3);// Srikanth

		String s4 = new String("Vcube");// 2 objects
		String s5 = new String("Vcube");// 1 object
		String s6 = new String("Vcube");// 1 object

		String s7 = new String();
		s7 = s6;
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);

		System.out.println("main method ended !!");
	}
}
