package com.collectionsframework;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestMapDemo6 {

	public static void main(String[] args) {

//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "A");
//		map.put(2, "B");
//
//		for (Integer k : map.keySet()) {
//			map.put(3, "C"); // modification
//		}
		
		Map<Integer,String> map = new ConcurrentHashMap<>();
		map.put(1,"A");
		map.put(2,"B");

		for(Integer k : map.keySet()){
		    map.put(3,"C"); // allowed
		}
		System.out.println(map);
	}
}
