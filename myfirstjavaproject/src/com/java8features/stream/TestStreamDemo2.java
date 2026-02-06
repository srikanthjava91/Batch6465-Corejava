package com.java8features.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo2 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,32,4,28,28,45,33,20);
		List<Integer> updatedlist = list.stream()
										.filter(i->i>25)
										.sorted()
										.distinct()
										.collect(Collectors.toList()); 
//		System.out.println(updatedlist);
		updatedlist.forEach(System.out::println);
		

	}

}
