package com.collectionsframework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestCollectionDemo19 {

	public static void main(String[] args) {

		NavigableSet<Integer> ns = new TreeSet<>();

		ns.add(1000);
		ns.add(800);
		ns.add(600);
		ns.add(700);
		ns.add(900);
		ns.add(300);
		ns.add(500);
		ns.add(250);
		ns.add(150);

		// Returns the least element in this set greater than or equal to
//		the given element, or null if there is no such element.
		System.out.println(ns.ceiling(400));

//		Returns the greatest element in this set less than or 
//		equal to the given element, or null if there is no such element.
		System.out.println(ns.floor(200));

//		Returns the greatest element in this set strictly less than the given element, or null if there is no such elemen
		System.out.println(ns.lower(550));

//		Returns the least element in this set strictly greater than the given element, or null if there is no such element.
		System.out.println(ns.higher(700));// 800

		System.out.println(ns.ceiling(1000));//1000

		System.out.println(ns);

	}

}
