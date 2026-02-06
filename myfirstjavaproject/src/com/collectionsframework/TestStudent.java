package com.collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student(18, "virat", 38, 9999999999L, 97.5);
		Student s2 = new Student(45, "Rohit", 39, 9999999988L, 96.5);
		Student s3 = new Student(1, "Rahul", 33, 9999999977L, 92.5);
		Student s4 = new Student(8, "Jadeja", 37, 9999999966L, 95.5);
		Student s5 = new Student(7, "Doni", 44, 9999999955L, 100.0);

		List<Student> listOfStudents = new ArrayList<>();

		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		listOfStudents.add(s4);
		listOfStudents.add(s5);

		for (Student s : listOfStudents) {
			System.out.println(s);
		}

	}

}
