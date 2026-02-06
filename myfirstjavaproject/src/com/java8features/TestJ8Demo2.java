package com.java8features;

interface TestIn2 {
	int addition();
}

public class TestJ8Demo2 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		TestIn2 t2 = () -> {
			int a = 100;
			int b = 100;
			int c = a + b;
			return c;
		};
		System.out.println(t2.addition());
	}
}
