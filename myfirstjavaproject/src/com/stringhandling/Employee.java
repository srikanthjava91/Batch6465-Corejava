package com.stringhandling;

public final class Employee {

	private final int id;
	private final String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name; // String is already immutable
	}

	public int getId() {
		return id; // OK → primitive, immutable
	}

	public String getName() {
		return name; // OK → String is immutable
	}
}
