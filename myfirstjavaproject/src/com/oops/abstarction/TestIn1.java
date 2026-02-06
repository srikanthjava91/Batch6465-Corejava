package com.oops.abstarction;

public interface TestIn1 {

	void method1();

	void method2();

	void method3();

	void method4();

	void method5();

	default void method6() {
		System.out.println("method6 info !");
	}

	static void method7() {
		System.out.println("method7 info !");
	}

	private void metho8() {
		System.out.println("method8 info !");
	}

}
