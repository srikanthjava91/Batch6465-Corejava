package com.oops.abstarction;

public class TestAbsDemo {

	public static void main(String[] args) {

//		TestAbs t = new TestAbs();
//		Cannot instantiate the type TestAbs
		TestAbs i1 = new TestA();
		i1.method1();
		i1.method2();
		i1.welcome();
		System.out.println(i1.orgId);

	}

}
