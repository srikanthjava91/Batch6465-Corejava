package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Collection<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Pineappale");
		fruits.add("Apple");
		fruits.remove("Mango");
		System.out.println(fruits);

		Collection<String> veggies = new ArrayList<>();
		veggies.add("Tomato");
		veggies.add("Potato");
		veggies.add("Bendi");
		veggies.add("Banana");
		veggies.add("Brinjal");

		fruits.retainAll(veggies);

		System.out.println(fruits);
		System.out.println(veggies);
	}
}
