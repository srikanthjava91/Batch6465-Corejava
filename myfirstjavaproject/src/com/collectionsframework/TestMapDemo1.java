package com.collectionsframework;

import java.util.Map;
import java.util.HashMap;

public class TestMapDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Map<Integer, String> names = new HashMap<>();

		names.put(7, "Dhoni");
		names.put(18, "Kohli");
		names.put(45, "Rohit");
		names.put(1, "Rahul");
		names.put(8, "Jadeja");
		names.put(33, "Pandya");
		names.put(34, "Pandya");
		names.put(10, "Sachin");
		names.put(7, "Srikanth");
		names.put(null, "Java");
		names.put(null, "J2EE");
		names.put(5, null);
		names.put(6, null);

		System.out.println(names.put(44, "Abhishek"));//null
		System.out.println(names.put(1, "Ravi"));//Rahul
		System.out.println(names);// {} []

	}

}
