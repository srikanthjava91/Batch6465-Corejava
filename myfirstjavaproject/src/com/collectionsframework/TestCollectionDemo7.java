package com.collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionDemo7 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("j2se");
		l1.add("j2ee");
		l1.add("Spring");
		l1.add("Spring Boot");
		l1.add("Microservices");
		
		l1.remove("Spring");
		System.out.println(l1.get(3));//
		System.out.println(l1);
		
		// Constructs an empty list with an initial capacity of ten
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(0, 50);
		l.add(1, 70);
		l.add(6, 80);
		l.add(90);

		l.remove(1);
		l.remove(l.indexOf(10));
		System.out.println(l);//IndexOutOfBoundsException

	}

}
