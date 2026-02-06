package com.collectionsframework;

public class Mobile {

	String model;
	String brand;
	double price;
	String color;

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

	public Mobile(String model, String brand, double price, String color) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

}
