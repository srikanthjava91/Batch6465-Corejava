package com.arrays;

public class TestArrDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		String[] names = { "Praveen", "Manikanta", "Madhu", "Rohit", "Manoj", "Upendra" };
		for (int i = 0; i < names.length / 2; i++) {
			if (names[i].toUpperCase().contains("A")) {
				System.out.println(names[i]);
			}
		}

		// for each or enhanced for loop
		for (String s : names) {
			if (s.startsWith("M")) {
				System.out.println(s);
			}
		}
	}
}
