package com.java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo3 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "J2SE", "Spring", "Spring Boot", "Servlets", "JSP", "Microservices",
				"JPA");
		List<String> updatedNames = names.stream()
									.filter(s -> s.startsWith("J"))
									.map(s-> s+" - Vcube")
									.map(String::toUpperCase)
									.sorted()
									.limit(3)
									.collect(Collectors.toList());
//		Consumer<String> c = s -> System.out.println(s);
//		updatedNames.forEach(c);
		updatedNames.forEach(System.out::println);
	}

}
