package com.constructors;

class Srikanth extends Teacher {

	Srikanth() {
		super("Java", "Srikanth", 100000.00, 22);
	}

	public static void main(String[] args) {
		System.out.println("main method From Srikanth");
		Srikanth s1 = new Srikanth();
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.salary);
		System.out.println(s1.age);
	}
}

public class Teacher {
	String subject;
	String name;
	double salary;
	int age;

	public Teacher(String subject, String name, double salary, int age) {
		super();
		System.out.println("parameterized arg from Teacher");
		this.subject = subject;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("main method from teacher !!");
	}

}
