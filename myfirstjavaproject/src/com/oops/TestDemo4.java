package com.oops;

class Employee1 implements Cloneable {
	int eid;
	String name;
	double empSal;
	Address1 address;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !");
	}

	public Employee1(int eid, double empSal, String name, Address1 address) {
		this.eid = eid;
		this.empSal = empSal;
		this.address = address;
		this.name = name;
	}

}

class Address1 {
	String city;
	String street;

	public Address1(String city, String street) {
		this.city = city;
		this.street = street;
	}

}

public class TestDemo4 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started !!");
		Address1 add1 = new Address1("Viajayawada", "Bhavani puram");
		Employee1 emp1 = new Employee1(101, 600000.00, "Vamsi", add1);

		System.out.println(emp1.eid);
		System.out.println(emp1.name);
		System.out.println(emp1.empSal);
		System.out.println(emp1.address.city);
		System.out.println(emp1.address.street);

		System.out.println("**********************");
		Employee1 emp2 = (Employee1) emp1.clone();// shallow copy
		System.out.println(emp2.empSal);
		System.out.println(emp2.address.city);
		System.out.println("**********************");
		emp2.address.city = "Hyderabad";

		System.out.println(emp1.equals(emp2));// false

		Employee1 emp3 = emp2;
		System.out.println(emp3.equals(emp2));

		System.out.println(emp3);//
		int x = 0x251a69d7;
		System.out.println(emp3.getClass());
		System.out.println(x);
		System.out.println(emp3.hashCode());
//		emp3 = null;
		System.gc();

		System.out.println(emp1.address.city);
		System.out.println(emp2.address.city);

	}

}
