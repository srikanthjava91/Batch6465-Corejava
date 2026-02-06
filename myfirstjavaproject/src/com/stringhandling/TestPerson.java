package com.stringhandling;

import java.util.Date;

public class TestPerson {

	public static void main(String[] args) {

		// Create a mutable Date object
		Date d1 = new Date();
		System.out.println("Original Date (d1): " + d1);

		// Create immutable Person object
		Person p = new Person("Srikanth", d1);

		System.out.println("Person Name   : " + p.getName());
		System.out.println("Person DOB    : " + p.getDob());

		// Try to modify original date d1
		d1.setTime(0); // changing date externally
		System.out.println("\nAfter modifying d1:");
		System.out.println("Modified d1   : " + d1);
		System.out.println("Person DOB    : " + p.getDob()); // should NOT change
//
//		// Try modifying Person DOB through getter
		Date dobFromPerson = p.getDob();
		dobFromPerson.setTime(999999999);
//
		System.out.println("\nAfter modifying date from getter:");
		System.out.println("Modified dobFromPerson: " + dobFromPerson);
		System.out.println("Person DOB            : " + p.getDob()); // still NOT changed

	}

}
