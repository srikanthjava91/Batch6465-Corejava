package com.collectionsframework;

import java.util.Stack;

//Stack : LIFO
public class TestCollectionDemo13 {

	public static void main(String[] args) {

		Stack<String> s = new Stack<>();

//		s.push("J2SE");
//		s.push("J2EE");
//		s.push("Servlets");
//		s.push("JDBC");
//		s.push("JPA");
//		s.push("Spring");
//		s.push("Spring Boot");

		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s.peek());
//		System.out.println(s);

		System.out.println(s.search("Spring"));//-1 

	}

}
