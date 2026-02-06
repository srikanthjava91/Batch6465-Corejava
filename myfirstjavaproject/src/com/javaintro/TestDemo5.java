package com.javaintro;

public class TestDemo5 {

	{
		System.out.println("instance block1 called ");
	}

	{
		System.out.println("instance block2 called ");
	}

	static {
		System.out.println("static block1 called ");
	}

	static {
		System.out.println("static block2 called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDemo5 t = new TestDemo5();
		method1();
		t.method2();
	}
	
	static void method1() {
		System.out.println("method1 called ");
	}
	
	void method2() {
		System.out.println("method2 called ");
	}

}
