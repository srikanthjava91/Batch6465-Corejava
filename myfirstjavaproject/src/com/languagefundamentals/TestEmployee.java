package com.languagefundamentals;

class Employee {
	int eid = 1;
	String empname = "srikanth";
	double salary = 100000.00;
	Address address = new Address();
}

class Address {
	int flatno = 123;
	String plot = "LIG";
	String street = "Road number2- KPHB";
	String city = "HYD";
	long pin = 500072;

}

//Driver class 
public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Employee();

		System.out.println("Employee Details :********* ");
		System.out.println(e.eid); // 0
		System.out.println(e.empname);// null
		System.out.println(e.salary);// 0.0

		System.out.println("Address of the Employee**********");
		System.out.println(e.address.flatno);//
		System.out.println(e.address.plot);
		System.out.println(e.address.street);
		System.out.println(e.address.city);
		System.out.println(e.address.pin);

	}

}
