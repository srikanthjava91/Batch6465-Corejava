package com.oops.abstarction;

public class Cat implements Animal {

	@Override
	public String sound() {
		return "meow meow meow !!";
	}

	@Override
	public void eat() {
		System.out.println("Cat can eat rat and drinks milk !!");
	}

	@Override
	public void walk() {
		System.out.println("Cat walk term came cat itself ");
	}

	@Override
	public void sleep() {
		System.out.println("Cat can sleep anytime !");
	}
}
