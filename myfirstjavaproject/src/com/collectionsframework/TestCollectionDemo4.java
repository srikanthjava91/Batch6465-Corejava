package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionDemo4 {

	public static void main(String[] args) {

		Collection<String> cricketers = new ArrayList<>();

		cricketers.add("MSD");
		cricketers.add("Virat");
		cricketers.add("Rohit");
		cricketers.add("Sachin");
		cricketers.add("Rahul");
		cricketers.add("Sehwag");
		cricketers.add("Gambir");
		cricketers.add("Harshit Rana");

		cricketers.remove("Gambir");
		System.out.println(cricketers);

		Iterator<String> itr = cricketers.iterator();
		while (itr.hasNext()) {
//			System.out.println(itr.next());
			if (itr.next().equals("Rahul")) {
				itr.remove();
			}
		}

		System.out.println(cricketers);

		System.out.println("**********************");
		// cricketer
		for (String cricketer : cricketers) {
			System.out.println(cricketer);
		}

//		System.out.println(cricketers);

	}

}
