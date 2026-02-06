package com.collectionsframework;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TestEmployee {

	public static void main(String[] args) {

//		List<String> empNameList = new ArrayList<>();
//		empNameList.add("MSD");
//		empNameList.add("Virat");
//		empNameList.add("Rohit");
//		empNameList.add("Jadeja");
//		empNameList.add("Rahul");
//		empNameList.add("Hardik");
//		System.out.println(empNameList);
//		Collections.sort(empNameList);
//		System.out.println(empNameList);

		Employee emp1 = new Employee(7, "MSD", 7000000.00, 42);
		Employee emp2 = new Employee(18, "Virat", 1800000.00, 38);
		Employee emp3 = new Employee(45, "Rohit", 4500000.00, 37);
		Employee emp4 = new Employee(8, "Jadeja", 800000.00, 36);
		Employee emp5 = new Employee(1, "Rahul", 1000000.00, 36);
		Employee emp6 = new Employee(33, "Hardhik", 3300000.00, 35);

		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
//		System.out.println(empList);

		Collections.sort(empList);

		for (Employee emp : empList) {
			System.out.println(emp);
		}

	}

}
