package com.stringhandling;

public class TestStrDemo5 {

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = a;
		a = 20;   // actually creates a new object
		System.out.println(b); // still 10
		System.out.println(a);
	}
}
