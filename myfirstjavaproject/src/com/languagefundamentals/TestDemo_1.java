package com.languagefundamentals;

public strictfp class TestDemo_1 {

	int roll$_No = 123;
	String _name = "Venkat";

	public static void main(String[] sri) {
		System.out.println("main method started !");
		TestDemo_1 t = new TestDemo_1();
		System.out.println(t.roll$_No);
		System.out.println(t._name);

		t.method1();
		System.out.println("main method ended !");
	}

	void method1() {
		System.out.println("method1 called ");
	}
}
