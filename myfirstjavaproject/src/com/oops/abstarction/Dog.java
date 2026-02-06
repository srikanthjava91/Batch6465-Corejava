package com.oops.abstarction;

public class Dog implements Animal {

	@Override
	public String sound() {
		return "Bow Bow !!";
	}

	@Override
	public void eat() {
		System.out.println("Dog can eat meat !!");
	}

	@Override
	public void walk() {
		System.out.println("Dog can walk and also run like anything !");
	}

	@Override
	public void sleep() {
		System.out.println("Dog can sleep maximum morning !");

	}

}
