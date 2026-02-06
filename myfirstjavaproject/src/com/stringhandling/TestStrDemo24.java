package com.stringhandling;

public class TestStrDemo24 {

	public static void main(String[] args) {

		String str = "Java-is-simple-in-vcube-at-JNTU-Hyderabad";
//		String str = "Java is simple in vcube at JNTU Hyderabad";
		String[] words = str.split("-", 3);
		int count = 0;

		for (String word : words) {
			System.out.println(word);
			count++;
		}
		System.out.println("Total Count of words : " + count);
	}
}
