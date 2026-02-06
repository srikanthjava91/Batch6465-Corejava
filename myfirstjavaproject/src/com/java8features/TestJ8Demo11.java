package com.java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {

	int sid;
	double marks;
	String name;

	public Student(int sid, double marks, String name) {
		this.sid = sid;
		this.marks = marks;
		this.name = name;
	}

}

public class TestJ8Demo11 {

	public static void main(String[] args) {

		Predicate<Student> p1 = (st) -> st.marks >= 50;
		Predicate<Student> p2 = (st) -> st.name.contains("i");
		Predicate<Student> p3 = p1.and(p2);

		Function<Student, String> f1 = (st) -> {
			String grade = "";

			if (st.marks >= 90) {
				grade = "A";
			} else if (st.marks >= 80) {
				grade = "B";
			} else if (st.marks >= 70) {
				grade = "C";
			} else if (st.marks >= 60) {
				grade = "D";
			} else if (st.marks >= 35) {
				grade = "Just Passed";
			} else {
				grade = "F";
			}

			return grade;

		};

		Consumer<Student> c1 = (s) -> {
			System.out.println("Student ID : " + s.sid);
			System.out.println("Student Name : " + s.name);
			System.out.println("Student Marks : " + s.marks);
			System.out.println("Geade : " + f1.apply(s));
			System.out.println("*******************************");
		};

		Student s1 = new Student(7, 79.9, "Dhoni");
		Student s2 = new Student(18, 100.0, "Kohli");
		Student s3 = new Student(45, 65.5, "Rohit");
		Student s4 = new Student(4, 72.5, "Abhishek");
		Student s5 = new Student(9, 50.0, "Srikanth");

		Student[] listOfStudents = { s1, s2, s3, s4, s5 };

		for (Student s : listOfStudents) {
			if (p3.test(s)) {
				c1.accept(s);
			}
		}

	}
}
