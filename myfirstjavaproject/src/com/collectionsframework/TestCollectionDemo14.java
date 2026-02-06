package com.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollectionDemo14 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		List<Integer> l = new ArrayList<>();

		l.add(101);
		l.add(102);
		l.add(105);
		l.add(104);
		l.add(106);
		l.add(107);

//		for (int i = 0; i < l.size(); i++) {
//			System.out.println(l.get(i));
//			l.add(3);
//		}

//		for (Integer i : l) {
//			System.out.println(i);
//			l.add(103);
//		}

//		Iterator<Integer> itr = l.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			l.add(103);
//		}

		System.out.println(l);
	}
}
