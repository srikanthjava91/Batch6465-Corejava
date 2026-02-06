package com.stringhandling;

public class TestStrDemo17 {

	public static void main(String[] args) {
		String s1 = "Srikanth Java";
		char[] ach = new char[127];
		s1.getChars(4, 10, ach, 0);
		System.out.print(ach);
	}
}
