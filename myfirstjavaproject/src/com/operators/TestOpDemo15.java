package com.operators;

public class TestOpDemo15 {

	public static void main(String[] args) {

		Integer i1 = 10;
		String name = "Srikanth";
		System.out.println(name instanceof String);
		System.out.println(name instanceof Object);

		System.out.println("************");
		System.out.println(i1 instanceof Integer);// true
		System.out.println(i1 instanceof Number);// true
		System.out.println(i1 instanceof Object);// true

		// Incompatible conditional operand types Integer and String
//		System.out.println(i1 instanceof String);

		System.out.println("**************************");
		System.out.println(null instanceof Integer);
		System.out.println(null instanceof String);

	}

}
