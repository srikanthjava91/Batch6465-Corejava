package com.shallow;

class Student1 {
	int sid;
	String sname;
	Address1 add1;

	public Student1(int sid, String sname, Address1 add1) {
		this.sid = sid;
		this.sname = sname;
		this.add1 = add1;
	}

	public Student1(Student1 student1) {
		this.sid = student1.sid;
		this.sname = student1.sname;
		this.add1 = new Address1(student1.add1);// Deep Copy

	}

	void show() {
		System.out.println("************************");
		System.out.println("SID : " + sid);
		System.out.println("Sname : " + sname);
		System.out.println("Address City : " + add1.city);
		System.out.println("Address Street : " + add1.street);

	}

}

class Address1 {
	String city;
	String street;

	public Address1(String city, String street) {
		this.city = city;
		this.street = street;
	}

	public Address1(Address1 add1) {
		this.city = add1.city;
		this.street = add1.street;
	}

}

public class TestDemo2 {

	public static void main(String[] args) {

		Address1 add1 = new Address1("Hyd", "KPHB");
		Student1 s1 = new Student1(1, "Vamshi", add1);
		s1.show();

		Student1 s2 = new Student1(s1);
		s2.add1.city = "Banglore";
		s2.show();
		s1.show();

	}

}
