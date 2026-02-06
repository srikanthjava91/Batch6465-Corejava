package com.collectionsframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapDemo2 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("TG", "Telangana");
		map.put("AP", "Andhra Pradesh");
		map.put("TN", "Tamil Nadu");
		map.put("KA", "Karnataka");
		map.put("MH", "Maharashtra");
		map.put("KL", "Kerala");
		map.put("DL", "Delhi");
		map.put("GJ", "Gujarat");
		map.put("RJ", "Rajasthan");
		map.put("UP", "Uttar Pradesh");
		map.put("MP", "Madhya Pradesh");
		map.put("WB", "West Bengal");
		map.put("OR", "Odisha");

		Set<Entry<String, String>> entries = map.entrySet();

		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + "-> " + entry.getValue());
		}

//		System.out.println(map);
		System.out.println("**********************************");
		System.out.println(map.containsKey("TN"));
		System.out.println(map.containsValue("Kerala"));
		System.out.println(map.get("UP"));

		System.out.println(map.isEmpty());
		System.out.println(map.keySet());// Set<K>
		System.out.println(map.values());// Collection<V>

	}

}
