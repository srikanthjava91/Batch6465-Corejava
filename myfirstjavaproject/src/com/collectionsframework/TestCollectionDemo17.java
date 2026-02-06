package com.collectionsframework;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestCollectionDemo17 {

	public static void main(String[] args) {
//		Set<Integer> s = new HashSet<>();
		Set<Integer> s = new LinkedHashSet<>();

		s.add(10);// 10/16 --> 10
		s.add(16);// 0
		s.add(18);// 2
		s.add(8);// 8
		s.add(5);// 5
		s.add(33);// 1
		s.add(36);// 4
		s.add(40);// 8

		System.out.println(s);
	}

}
