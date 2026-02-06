package com.java8features.stream;

import java.util.Optional;

public class TestOptionalDemo1 {

	public static void main(String[] args) {

		Optional<String> o1 = Optional.ofNullable("Srikanth");
		Optional<String> o2 = Optional.ofNullable(null);

		System.out.println("*****************");
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1.isEmpty());//false
		System.out.println(o1.isPresent());//true

		System.out.println(o2.isEmpty());//true
		System.out.println(o2.isPresent());//false
		System.out.println("*****************");

		String[] names = { "Ishan", "Abhishek", "Akshar", "Tialk", "Surya", "Hardhik", null, null };

		for (String name : names) {
			Optional<String> o = Optional.ofNullable(name);
			if (o.isPresent()) {
				System.out.println(name.toUpperCase());
			}

		}

	}

}
