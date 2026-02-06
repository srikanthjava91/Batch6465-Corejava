package com.constructors;

public class Student {

	int sid;
	String sname;
	long phone;
	int age;
	String city;

	Student(String city) {
		System.out.println("one arg constructor !!");
		this.city = city;
	}

	Student(String name, long phone, int age) {
		System.out.println("3 arg parameterized constructor called");
		this.sname = name;
		this.phone = phone;
		this.age = age;
	}

	Student(int sid, String sname) {
		System.out.println("2 arg parameterized constructor called !");
		this.sid = sid;
		this.sname = sname;
	}

	public Student() {
		System.out.println("no arg constructor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		Student s1 = new Student(1, "Madhu");
		s1.display();

		Student s2 = new Student("HYD");
		s2.display();

		Student s3 = new Student("Karthik", 9999999999L, 22);
		s3.display();

	}

	void display() {
		System.out.println("*********");
		System.out.println("Student ID : " + sid);
		System.out.println("Student Name : " + sname);
		System.out.println("Student Phone : " + phone);
		System.out.println("Student Age : " + age);
		System.out.println("Student City : " + city);
	}

}
