package com.stringhandling;

public class TestStrDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestStrDemo6 t = new TestStrDemo6();
		System.out.println(t.toString());

		int[] a = { 1, 2, 3 };
		System.out.println(a);// Address of the object

		// String is Collection characters or Array of characters.
		char[] ch = { 'A', 'P', 'P' };
		System.out.println(ch);// APP

		String s = new String();
		System.out.println(s.toString());

		System.out.println("main method ended ");
	}

}
