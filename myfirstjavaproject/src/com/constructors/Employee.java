package com.constructors;

public class Employee {

	int eid;
	String ename;
	double esal;
	long phone;
	int age;

	Employee() {
		this(1, "Unknown");// calling two arg constructor
		System.out.println("no arg constructor !");

	}

	Employee(int eid, String ename) {
		this(eid, ename, 200000.00);// calling three arg constructor in 2 arg
		System.out.println("Two arg constructor called ");
		this.eid = eid;
		this.ename = ename;
	}

	Employee(int eid, String ename, double esal) {
		System.out.println("Three arg constructor called ");
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");

		Employee emp1 = new Employee();
		emp1.showDetails();

		Employee emp2 = new Employee(2, "Srikanth");
		emp2.showDetails();
		
		
		Employee emp3= new Employee();
		emp3.showDetails();

	}

	void showDetails() {
		System.out.println("*****************");
		System.out.println("Employee ID  : " + eid);
		System.out.println("Employ Name  : " + ename);
		System.out.println("Employee Salary : " + esal);
		System.out.println("Employee age : " + age);
		System.out.println("Phone number : " + phone);
	}

}
