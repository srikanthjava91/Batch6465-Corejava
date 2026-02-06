package com.constructors;

public class Vehicle1 {

	public Vehicle1() {
		System.out.println("no arg constructor from Vehicle1 ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Vehicle1 ");
	}

}

class Scooty extends Vehicle1 {

	Scooty() {
		super();
		System.out.println("no arg constructor from Scooty ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Scooty ");
		Scooty s1 = new Scooty();

	}
}
