package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo2 {

	public static void main(String[] args) {

		Collection<String> boys = new ArrayList<>();
		boys.add("Jay");
		boys.add("Preetham");
		boys.add("Madhu");
		boys.add("Venkteswarlu");
		boys.add("Aditya");
		boys.add("Manoj");
		boys.add("Aditya");
		boys.add("Raj Kumar");
		boys.add("Swaroop");
//		boys.clear();
		System.out.println(boys);
		System.out.println(boys.contains("Adityaa"));

		Collection<String> girls = new ArrayList<>();
		girls.add("Bhavana");
		girls.add("Uma");
		girls.add("Bhvya");
		girls.add("Keerthi");
		girls.add("Laya");
		girls.add("Srujana");
		girls.add("Laya");
//		System.out.println(girls);

		Collection<String> students = new ArrayList<>();

		students.addAll(boys);
		students.addAll(girls);

		System.out.println(students);

		System.out.println("**************");
//		boys.clear(); //[]
		boys.add("Srikanth");
//		Returns true if this collection contains all of the elements in the specified collection.
		System.out.println(students.containsAll(boys));// true

		for (String student : students) {
			System.out.println(student);
		}

		System.out.println("*******************************************");
		System.out.println(students);
		students.removeAll(boys);
		System.out.println(students);

		
		System.out.println(students.size());
		String st = new String("Sriaknt");
		System.out.println(st.length());
		
		Object[] arr = students.toArray();
		System.out.println(arr.length);
		for (Object o : arr) {
			System.out.println(o);
		}

	}

}
