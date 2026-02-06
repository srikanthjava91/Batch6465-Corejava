package com.oops.abstarction;

interface In1 {
	void method1();

	void method2();
}

interface In2 {
	void method2();

	void method3();

}

interface In3 extends In2, In1 {

}

class TestIn implements In3 {

	@Override
	public void method1() {
		System.out.println("method1 called ");
	}

	@Override
	public void method2() {
		System.out.println("method2 called ");
	}

	@Override
	public void method3() {
		System.out.println("method3 called ");
	}

}

public class TestMIDemo1 {

	public static void main(String[] args) {
		In3 t1 = new TestIn();
		t1.method1();
		t1.method2();
		t1.method3();
	}

}
