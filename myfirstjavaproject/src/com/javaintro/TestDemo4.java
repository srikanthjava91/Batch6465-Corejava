package com.javaintro;

public class TestDemo4 {

	// static method
	static void welcome() {
		System.out.println("Welcome method called !");
	}

	// main method
	public static void main(String[] args) {
		System.out.println("main method started !");

		TestDemo4 t = new TestDemo4();

		// calling the static method
		welcome();

		// calling the instance method
		t.hello();

		System.out.println("main method ended !");
	}

	// instance method
	void hello() {
		System.out.println("Hello method called ");
	}

}
