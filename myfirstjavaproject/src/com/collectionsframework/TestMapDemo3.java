package com.collectionsframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//WAP to find count for each characters..?  or occurrences of the characters.
//Java --> J=1, a=2, v =1 
//aabbbbcccccdd --> a=2, b=4,c=5,d=2
public class TestMapDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);// sreee
		String str = sc.nextLine();

		Map<Character, Integer> map = new HashMap<>();
		char[] ch = str.toCharArray();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> entries = map.entrySet();
		for (Entry<Character, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
