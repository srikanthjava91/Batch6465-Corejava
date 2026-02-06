package com.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestCollectionDemo8 {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>();
		l1.add("j2se");
		l1.add("j2ee");
		l1.add("Spring");
		l1.add("Spring Boot");
		l1.add("Microservices");
		l1.add("j2se");
		l1.add("j2ee");
		
		System.out.println(l1.subList(0, 3));//j2se j2se Spring

		System.out.println(l1.indexOf("j2se"));// 0
		System.out.println(l1.lastIndexOf("j2se"));// 5

		System.out.println("**********************");
		Iterator<String> i1 = l1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("**********************");
		ListIterator<String> lstr = l1.listIterator();

		while (lstr.hasNext()) {
			System.out.println(lstr.next());
		}
		System.out.println("----------------------------");
		while (lstr.hasPrevious()) {
			System.out.println(lstr.previous());
		}
	}
}
