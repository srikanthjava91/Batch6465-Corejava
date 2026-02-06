package com.oops;

class TestMI1 {
	TestMI1() {

		System.out.println("no arg constructor test1 ");
	}
}

class TestMI2 {
	TestMI2() {

		System.out.println("no arg constructor test2 ");
	}
}

class TestMI3 extends TestMI2 {

	TestMI3() {

		System.out.println("no arg constructor test3 ");
	}

}

public class TestInhDemo10 {

	public static void main(String[] args) {
		System.out.println("main method strated !");
		TestMI3 t3 = new TestMI3();

	}

}
