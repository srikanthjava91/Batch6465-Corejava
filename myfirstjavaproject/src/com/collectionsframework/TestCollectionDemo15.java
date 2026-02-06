package com.collectionsframework;

import java.util.HashSet;
import java.util.Set;

public class TestCollectionDemo15 {

	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<>();
		s1.add(10);// 16)10( --> 10 
		s1.add(1);// 16)1(--> 1
		s1.add(32);//16)32(2 --> 0 
		s1.add(51);// 16)51(3 --> 3 
		s1.add(5);//16) 5( ---> 5 
		s1.add(3);//16) 3( --> 3 
		s1.add(68);//16) 68( 4 -- 4 

		System.out.println(s1);//32 1 51 3 68 5 10 

		Set<String> s = new HashSet<>();
		s.add("J2se");
		s.add("J2se");
		s.add("J2se");
		s.add("J2ee");
		s.add("J2me");
		s.add("J2se");
		s.add("Spring");
		s.add("Spring Boot");

		System.out.println(s);

	}
}
