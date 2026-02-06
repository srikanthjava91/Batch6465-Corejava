package com.oops.abstarction;

public abstract class TestAbs implements TestIn1 {
	
	

	int orgId = 555;
	String name = "Vcube";

	// Constructors
	TestAbs() {
		System.out.println("TestAbs Constructor called !");
	}

	// instance method
	void welcome() {
		System.out.println("Welcome to abstarct class ");
	}

	// abstract methods
	abstract void hello();

	// Override methods from interface
	@Override
	public void method1() {
	}

	@Override
	public void method2() {
	}

	@Override
	public void method3() {
	}

	@Override
	public void method4() {
	}

	@Override
	public void method5() {
	}

}
