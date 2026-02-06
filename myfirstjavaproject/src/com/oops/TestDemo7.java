package com.oops;

abstract class Test6 {
	void method1() {
		System.out.println("method1 called !");
	}

	abstract void method2();

}

public class TestDemo7 extends Test6 {

	public static void main(String[] args) {
		System.out.println("Hello abstravct !");
	}

	@Override
	void method2() {
		System.out.println("method2 called from TestDemo7");
	}
}

abstract class TestDemo8 extends TestDemo7 {

//	@Override
//	void method2() {
//		System.out.println("method2 called from TestDemo8");
//	}
	
	abstract void method2();

}
