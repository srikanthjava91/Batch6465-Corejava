package com.shallow;

class Student implements Cloneable {
	int id;
	String name;
	Address add;

	public Student(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Address {
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}

}

public class Testdemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address a = new Address("hyderabad");
		Student s = new Student(1, "Ajith", a);

		System.out.println("Before shallow copy ");
		Student s1 = (Student) s.clone();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.add.city);

		System.out.println("Aftter shallow copy ");
		s1.add.city = "warangal";
		System.out.println(s.add.city);
		System.out.println(s1.add.city);

	}

}
