package com.java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamDemo4 {

	public static void main(String[] args) {
		
		long count = Stream.of("apple", "banana", "cherry","Orange")
                .filter(s -> s.contains("a"))
                .count();
				System.out.println(count); // Output: 2
		
		List<Integer> numbers = Arrays.asList(1, 4, 5, 8, 9, 10);
		int sum = numbers.stream()
		                 .filter(n -> n % 2 == 0) //4 8 10 --> 
		                 .map(n -> n * n) //16 64 100 
		                 .reduce(0, Integer::sum); //16 + 64 + 100 
		System.out.println(sum);  
		
		

		
		List<Double> salaries = Arrays.asList(100000.00,400000.00,500000.00,300000.00,600000.00,800000.00,700000.00);
		List<Double> updatedSalaries = salaries.stream()
											    .map(d-> d+50000.00)
											    .sorted()
											    .distinct()
											    .collect(Collectors.toList());
		
		updatedSalaries.forEach(System.out::println);
	}

}
