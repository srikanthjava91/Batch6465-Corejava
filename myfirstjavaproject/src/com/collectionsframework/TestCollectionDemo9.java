package com.collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionDemo9 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();// 10--> 11th element the size will be 15
		l1.add("Ram");
		l1.add("Srikanth");
		l1.add("Java");
		l1.add("Upendra");
		l1.add("Andra King");
		l1.add("Bhagysri");
		l1.add("Mahesh");
		l1.add("Rao Ramesh");
		l1.add("Satya");
		l1.add("Srikanth");
		l1.add("Rajiv");
		l1.add("Ram");
		l1.add("Srikanth");
		l1.add("Java");
		l1.add("Upendra");
		l1.add("Andra King");
		l1.add("Bhagysri");
		l1.add("Mahesh");
		l1.add("Rao Ramesh");
		l1.add("Satya");
		l1.add("Srikanth");
		l1.add("Rajiv");
		System.out.println(l1.get(2));// IndexOutOfBoundsException
		System.out.println(l1.size());
	}

}
