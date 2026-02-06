package com.collectionsframework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestCollectionDemo16 {

	public static void main(String[] args) {

		Map<Integer, String> h = new HashMap<>();
		h.put(7, "Dhoni");
		h.put(18, "Kohli");
		h.put(45, "Rohit");
		h.put(1, "Rahul");
		h.put(33, "Hardhik");
		h.put(7, "Srikanth");
		System.out.println(h);
		System.out.println("*******************");

//		Constructs a new, empty set; 
//		the backing HashMap instance has default initial capacity (16) and 
//		load factor (0.75).
		Set<Integer> s = new HashSet<>();

		s.add(10);// 10/16 --> 10
		s.add(16);// 0
		s.add(18);// 2
		s.add(8);// 8
		s.add(5);// 5
		s.add(33);// 1
		s.add(36);// 4
		s.add(40);// 8
		s.add(7);
		s.add(18);
		s.add(45);
		s.add(1);
		s.add(15);
		s.add(33);
		s.add(44);
		s.add(null);
		s.add(null);
		s.add(null);
		System.out.println(s);// null 16 33 18 36 5 8 40 10

	}

}
