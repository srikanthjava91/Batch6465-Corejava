package com.oops.abstarction;

public class Monkey implements Animal {

	@Override
	public String sound() {
		return "kichkichkich";
	}

	@Override
	public void eat() {
		System.out.println("Monkey will eat Bananan's ");
	}

	@Override
	public void walk() {
		System.out.println("MOnkey can walk and also jumps..");
	}

	@Override
	public void sleep() {
		System.out.println("Monkey can sleep anytime !");

	}

//	/Default methods are allowed only in interfaces.
//	@Override
//	public default void run() {
//		System.out.println("Monkey can run and also jumps!!");
//	}

	@Override
	public void run() {
		System.out.println("Monkey can run and also jumps!!");
	}

}
