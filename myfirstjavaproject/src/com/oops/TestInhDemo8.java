package com.oops;

class Parent {
	int i = 10;

	void hello() {
		System.out.println("hello method called !");
	}
}

class Child extends Parent {

	int j = 20;

	void hello1() {
		System.out.println("hello1 method called !");
	}
}

class GrandChild extends Child {

	int k = 30;

	void hello2() {
		System.out.println("hello2 method called !");
	}
}

public class TestInhDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		GrandChild c1 = new GrandChild();
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
		c1.hello();
		c1.hello1();
		c1.hello2();

	}
}
