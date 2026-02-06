package com.java8features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamDemo1 {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(15);
		l.add(17);
		l.add(34);
		l.add(11);
		l.add(32);
		l.add(15);
		l.add(15);
		l.add(10);
		l.add(19);
		
		Stream<Integer> s = l.stream();
		
		List<Integer> l1 = s.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);

	}

}
