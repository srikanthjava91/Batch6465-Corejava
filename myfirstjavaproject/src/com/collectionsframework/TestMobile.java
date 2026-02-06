package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMobile {

	public static void main(String[] args) {

		Mobile m1 = new Mobile("9R", "One Plus", 40000.00, "Blue");
		Mobile m2 = new Mobile("17 Pro", "Iphone", 140000.00, "Black");
		Mobile m3 = new Mobile("S24", "Samsung", 120000.00, "White");
		Mobile m4 = new Mobile("9A", "Google Pixel", 1300000.00, "Lite Blue");
		Mobile m5 = new Mobile("3A", "Nothing", 35000.00, "Blue");
		Mobile m6 = new Mobile("7pro", "Huwai", 240000.00, "Red");

		List<Mobile> mobileList = new ArrayList<>();
		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
		mobileList.add(m4);
		mobileList.add(m5);
		mobileList.add(m6);

		Comparator<Mobile> c = new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				if (o1.price < o2.price) {
					return 1;
				} else if (o1.price > o2.price) {
					return -1;
				} else {
					return 0;
				}
			}

		};

		Collections.sort(mobileList, c);

		for (Mobile m : mobileList) {
			System.out.println(m);
		}
	}
}
