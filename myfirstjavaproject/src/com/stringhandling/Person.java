package com.stringhandling;

import java.util.Date;

public final class Person {

	private final String name;
	private final Date dob; // mutable class!

	public Person(String name, Date dob) {
		this.name = name;
		this.dob = new Date(dob.getTime()); // create copy
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return new Date(dob.getTime()); // return copy
	}
}
