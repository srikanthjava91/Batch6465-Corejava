package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo3 {

	public static void main(String[] args) {

		Collection<Character> c1 = new ArrayList<>();
		c1.add('V');

		if (c1.isEmpty()) {
			c1.add('A');
			c1.add('B');
			c1.add('C');
			c1.add('D');
		}

		System.out.println(c1);

		Collection<Integer> num1 = new ArrayList<Integer>();
		num1.add(10);
		num1.add(20);
		System.out.println(num1.hashCode());// 1291

		Collection<Integer> num2 = new ArrayList<Integer>();
		num2.add(10);
		num2.add(20);
		System.out.println(num2.hashCode());
		System.out.println(num1.equals(num2));// 1291

		Collection<String> names1 = new ArrayList<>();
		names1.add("Pawan");
		names1.add("Charan");
		names1.add("Arjun");
		System.out.println(names1.hashCode());

		Collection<String> names2 = new ArrayList<>();
		names2.add("Pawan");
		names2.add("Charan");
		names2.add("Arjun");
		System.out.println(names2.hashCode());
		System.out.println(names1.equals(names2));

	}

}
