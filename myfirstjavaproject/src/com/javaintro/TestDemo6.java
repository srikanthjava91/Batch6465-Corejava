package com.javaintro;

public class TestDemo6 {

	public static void main(String[] args) {
		System.out.println("mian method strated ");
		method1();

	}

	// in static, we cannot call instance methods directly, we must need to create
	// objects.
	static void method1() {
		System.out.println("method1 called !");
		TestDemo6 t = new TestDemo6();
		t.method2();
	}

	// Yes, We can call instance methods in instance method directly !
	void method2() {
		System.out.println("methdo2 called ");
		method3();
	}

	void method3() {
		System.out.println("method3 called ");
		//method4();
	}

	static void method4() {
		System.out.println("method4 ");
	}

}
