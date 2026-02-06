package com.langfun.methods;

//no return type + no arguments --> only execution 
public class TestDemo1 {

	// instance method
	void hello() {
		System.out.println("Hello, Good afternoon ");
		System.out.println("Hello, Good afternoon ");
	}

	// static method
	static void welcome() {
		System.out.println("welcome to Java world !");
		System.out.println("welcome to Java world !");
	}

	// main method with no return type + with arguments
	public static void main(String[] args) {
		System.out.println("main method started !");

		TestDemo1 t = new TestDemo1();
		TestDemo1.welcome();
		t.hello();
		
		System.out.println("main method ended !");
	}
}
