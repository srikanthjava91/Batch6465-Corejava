package com.exceptionhandling;

public class TestEXDemo8 {

	public static void main(String[] args) {

		System.out.println("main method started ");

		try {
			System.out.println(10 / 2);
			String s = "java";
			System.out.println(s.length());
			System.out.println(s.charAt(5));
		} catch (ArithmeticException | NullPointerException | StringIndexOutOfBoundsException e) {
			System.err.println(e.toString());
		}

		System.out.println("main method ended");

	}

}
