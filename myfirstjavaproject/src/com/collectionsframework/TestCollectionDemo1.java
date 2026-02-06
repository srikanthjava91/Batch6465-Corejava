package com.collectionsframework;

import java.util.Collection;
import java.util.ArrayList;

public class TestCollectionDemo1 {

	public static void main(String[] args) {

		Object[] arr = { 1, "Srikanth" };

//		Collection is a raw type. 
//		References to generic type Collection<E> should be parameterized
		Collection<Integer> c = new ArrayList<>();
		c.add(101);
		c.add(102);
		c.add(105);
		c.add(103);
		c.add(104);
		c.add(106);
		c.add(100);
//		c.add("Srikanth");
//		c.add("Jay");
		System.out.println(c);

		for (int a : c) {
			System.out.println(a);
		}

	}

}
