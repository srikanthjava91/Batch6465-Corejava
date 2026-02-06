package com.java8features.stream;

import java.util.Arrays;
import java.util.List;

public class TestStreamDemo6 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Jerry", "Jim");
					 names.parallelStream()
					 .forEach(name -> System.out.println(Thread.currentThread().getName() + " - " + name));
	}
}
