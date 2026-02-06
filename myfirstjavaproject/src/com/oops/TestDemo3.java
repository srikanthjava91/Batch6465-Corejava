package com.oops;

class Student implements Cloneable {
	String sname;
	Address address;

	public Student(String sname, Address address) {
		this.sname = sname;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

class Address {
	String city;

	public Address(String city) {
		this.city = city;
	}
}

public class TestDemo3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started !");
		Address add = new Address("Hyderabad");

		System.out.println("Before clone !");
		Student s1 = new Student("Srikanth", add);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);

		System.out.println("After clone !");
		Student s2 = (Student) s1.clone();
		System.out.println(s2.sname);
		System.out.println(s2.address.city);

		s2.address.city = "Vijayawada";
		System.out.println("************************");
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		

		System.out.println("main method ended !");

	}
}
