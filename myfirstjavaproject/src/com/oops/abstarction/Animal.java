package com.oops.abstarction;

public interface Animal {

	public static void main(String[] args) {
		System.out.println("mian method started !");

	}

	// final variables
	public static final String orgName = "AnimalPark";

	// abstract method which provides only declaration
	public abstract String sound();

	void eat();

	void walk();

	void sleep();

//	 Backward Compatibility in Interfaces (Abstraction)
//Backward compatibility means — 
//	old code should still work even after new changes are made in the interface.

//	🧩 Why it’s Important
//	Before Java 8, interfaces could only contain abstract methods.
//	So if you added a new method to an interface →
//	👉 All implementing classes had to override that new method 
//	— otherwise, code would break ❌.
//	That made interfaces not backward compatible.

//	💡 Java 8 Solution:
//		To solve this, Java 8 introduced two special types of methods inside interfaces:
//		default methods
//		static methods
//		These allow developers to add new methods to interfaces without breaking existing implementation classes.
//		default methods can override !!

//	///private methods : to avoid duplicate code from default methods 
	private void hello() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}

	default void run() {
		System.out.println("Every animal can run !");
		hello();

	}

	default void run1() {
		System.out.println("all animals can run and run1 method called !");
		hello();

	}

	// To provide constant behavior for all the classes will use static
	// static methods we cannot override and we call only by using interface name
	// only.

	static void breath() {
		System.out.println("Every animal should breath !! ");
	}

}
