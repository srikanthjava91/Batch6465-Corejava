package com.collectionsframework;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestCollectionDemo18 {

	public static void main(String[] args) {

		SortedSet<Integer> ss = new TreeSet<>();
		ss.add(10);
		ss.add(5);
		ss.add(10);
		ss.add(40);
		ss.add(30);
		ss.add(20);
		ss.add(50);
		ss.add(35);
//		ss.add("apple");
//		ss.add("Cat");
//		ss.add("Banana");

		System.out.println(ss);
		System.out.println(ss.first());// 5
		System.out.println(ss.last());// 50
		System.out.println(ss.reversed());
		// Returns a view of the portion of this set whose elements are
//		strictly less than toElement.
		System.out.println(ss.headSet(30));// 5 10 20
//		Returns a view of the portion of this set whose elements are 
//		greater than or equal to fromElement. 
		System.out.println(ss.tailSet(30));// 30 35 40 50
//		Returns a view of the portion of this set whose elements range 
//		from fromElement, inclusive, to toElement, exclusive. 
		System.out.println(ss.subSet(20, 40));// 20 30 35

		System.out.println(ss.getFirst());
		System.out.println(ss.getLast());
		System.out.println(ss.removeFirst());
		System.out.println(ss.removeLast());
		System.out.println(ss);

	}

}
