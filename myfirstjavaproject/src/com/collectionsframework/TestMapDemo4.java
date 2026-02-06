package com.collectionsframework;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

//IdentityHashMap
//When we use HashMap, Internally it's using equals method to compare the String.
//When comes IdentityHashMap, Internally it's using == operator to compare the String.
public class TestMapDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Map<String, String> m1 = new IdentityHashMap<>();

//		String s1 = "Srikanth";//101
//		String s2 = "Srikanth";//101

		String s1 = new String("Srikanth");//102
		String s2 = new String("Srikanth");//103

		m1.put(s1, "Java");
		m1.put(s2, "Frameworks");

		System.out.println(m1);
	}
}
