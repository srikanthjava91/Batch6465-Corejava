package com.collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		List<Integer> l = new ArrayList<>();
		l.addFirst(null);
		l.add(101);
		l.add(102);
		l.add(103);
		l.add(104);
		l.add(105);
		System.out.println(l);
	}
}
