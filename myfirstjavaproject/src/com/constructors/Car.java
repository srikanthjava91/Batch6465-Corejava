package com.constructors;

public class Car {

	String model;
	String brand;
	double price;
	String color;

	// no arg constructor
	Car() {
		System.out.println("No arg constructor called !");
		model = "unknown";
		brand = "unknown";
		color = "unknown";
	}

	// Parameterized constructor
	public Car(String model, String brand, double price, String color) {
		System.out.println("Parameterized constructor called !");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Car class !");

		// the below Object is created with the help of default constructor
		// the below object is create with the help of no-arg constructor
		Car c1 = new Car();
		c1.show();

		Car c2 = new Car("Sonet", "KIA", 1200000.00, "RED");
		c2.show();

		Car c3 = new Car("Nexon", "Tata", 1500000.00, "White");
		c3.show();

	}

	void show() {
		System.out.println("******************");
		System.out.println("Model of the Car : " + model);// null
		System.out.println("Brand of the car : " + brand);// null
		System.out.println("Car color : " + color);// null
		System.out.println("Price of the Car : " + price);// 0.0
		System.out.println("******************");
	}

}
