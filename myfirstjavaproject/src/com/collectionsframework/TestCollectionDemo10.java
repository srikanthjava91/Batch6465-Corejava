package com.collectionsframework;

import java.util.LinkedList;
import java.util.List;

public class TestCollectionDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		List<String> l1 = new LinkedList<>();// 10--> 11th element the size will be 15
		l1.add("Ram");
		l1.add("Srikanth");
		l1.add("Java");
		l1.add("Upendra");
		l1.add("Andra King");
		l1.add("Bhagysri");
		l1.add("Mahesh");
		l1.add("Rao Ramesh");
		
		System.out.println(l1);

	}

}
