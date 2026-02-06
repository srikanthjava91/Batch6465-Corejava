package com.constructors;

public class Animal {

	String color;
	String breed;
	int age;
	String name;

	Animal() {
		this(4, "Chicho");
		System.out.println("no arg constructor called ");
		System.out.println("no arg constructor called ");
		System.out.println("no arg constructor called ");
	}

	Animal(String breed) {
		this();
		System.out.println("one arg constructor !");
		this.breed = breed;
	}

	Animal(int age, String name) {
		System.out.println("Two arg constructor called ");
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		Animal a1 = new Animal();
		a1.display();

		Animal a2 = new Animal("German Shepherd");
		a2.display();

		Animal a3 = new Animal(4, "juju");
		a3.display();

	}

	void display() {
		System.out.println("color : " + color);
		System.out.println("breed : " + breed);
		System.out.println("age : " + age);
		System.out.println("name : " + name);
		System.out.println("**********************");

	}
}
