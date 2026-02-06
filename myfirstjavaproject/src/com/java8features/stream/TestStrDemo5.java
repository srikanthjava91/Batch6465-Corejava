package com.java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStrDemo5 {

	public static void main(String[] args) {

		List<String> sentences = Arrays.asList("hello world", "java stream flatmap", "Java is simple");
       
		List<String> words = sentences.stream()
									  .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
									  .collect(Collectors.toList());

        System.out.println(words);  // Output: [hello, world, java, stream, flatmap]

		System.out.println("*********************************");
		
		List<List<String>> nestedList = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"),
				Arrays.asList("e"));
		List<String> flatList = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(flatList); // Output: [a, b, c, d, e]

	}

}
