package com.constructors;

//Parent or Super or Base
public class Vehicle {
	String name;
	double price;

	Vehicle() {
		
		System.out.println("No arg constructor from vehicle ");
	}

	public Vehicle(String name, double price) {
		System.out.println("two arg constructor called ");
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		System.out.println("main method started from vehicle!");
	}
}

//Child or Sub or Derived 
class Bike extends Vehicle {

	Bike() {
		super("Fz-S", 200000.00);
		System.out.println("no arg constructor from Bike");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Bike!");
		Bike b = new Bike();
		System.out.println(b.name);
		System.out.println(b.price);

	}
}
