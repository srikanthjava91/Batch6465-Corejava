package com.oops.abstarction;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("main method started !");

		// Cannot instantiate the type Animal
//		Animal a = new Animal();

		System.out.println("Cat related info **************");
		Animal c = new Cat();// Up-casting Abstraction & dynamic dispatching
		System.out.println(c.sound());
		c.eat();
		c.walk();
		c.sleep();
		c.run();

		// This static method of interface Animal can only be accessed as Animal.breath
//		c.breath();
		Animal.breath();

		System.out.println("Dog related info **************");
//		Creating an object of a child class and storing it into a parent interface reference 
//		is the concept of abstraction, by using interface reference 
//		we can point to interface functionalities but get the child behaviors in our implementation.
		Animal d = new Dog();
		System.out.println(d.sound());
		d.eat();
		d.walk();
		d.sleep();
		d.run();
		Animal.breath();

		System.out.println("MOnkey Related info *****************");
		Animal m = new Monkey();
		System.out.println(m.sound());
		m.eat();
		m.walk();
		m.sleep();
		m.run();
		Animal.breath();
		System.out.println(Animal.orgName);

	}

}
