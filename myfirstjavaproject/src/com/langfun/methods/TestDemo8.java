package com.langfun.methods;

class Employee {
	int eid;
	String ename;
	Address address;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

}

class Address {
	String city;
	String street;

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}

}

public class TestDemo8 {

	// Even though the method return type is int, we can return char values.
	static int method1() {
		char c = 'A';
		return c;
	}

	// Even though we can store int values in char.
	// But if the method return type is char, we cannot return int values directly.
	// Yes, we can return int values with type-casting.
	static char method2() {
		int a = 65;
		return (char) a;
	}

	static Employee getEmployeeDetails(Address add) {
		Employee e = new Employee();
		e.eid = 123;
		e.ename = "Srikanth";
		e.address = add;
		return e;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		int aValue = method1();
		System.out.println("A value : " + aValue);
		System.out.println("C value : " + method2());

		Address address = new Address();
		address.city = "Hyd";
		address.street = "JNTU";

		// Call by Reference
		Employee emp = getEmployeeDetails(address);
		System.out.println(emp);

	}

}
