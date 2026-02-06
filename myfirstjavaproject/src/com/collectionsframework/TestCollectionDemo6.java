package com.collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionDemo6 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(18);
		l.add(7);
		l.add(45);
		l.add(4);
		l.add(1, 5);// 10 5 18 7 45 4
		l.set(2, 15);// 10 5 15 7 45 4
		System.out.println(l.get(5));//4
		l.add(44);
		l.add(1);
		l.add(null);
		l.add(null);
		l.add(null);

		System.out.println(l);

	}

}
