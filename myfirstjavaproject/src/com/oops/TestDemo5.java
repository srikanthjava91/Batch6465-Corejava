package com.oops;

class TestDemo6 {

	int a = 10;
	static String name = "Srikanth";
	static int b = 100;

	public static void main(String[] args) {
		System.out.println("main method from TestDemo6 *****");
		TestDemo6.b = 200;

	}

}

public class TestDemo5 extends TestDemo6 {

	void hello() {
		System.out.println(b);
		a = 20;
		name = "Java";
		System.out.println(a);
		System.out.println(name);
	}

	public static void main(String[] args) {
		System.out.println("main method from TestDemo5 *****");
		TestDemo5 t = new TestDemo5();
		t.hello();
	}

}
