package com.langfun.methods;

import java.util.Scanner;

//Scanner 
//WAP to read the elements from the console.
//a
public class TestDemo3 {

	void getFullName(String fname, String lname) {
		System.out.println("Full name : " + fname + " " + lname);
	}

	void getAge(int age) {
		System.out.println("Your age : " + age);
	}

	void getGenderDetails(char c) {
		System.out.println("gender info : " + c);
	}

	void getFeeInfo(double fee) {
		System.out.println("Fee info : " + fee);

	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDemo3 t3 = new TestDemo3();

		TestDemo1 t1 = new TestDemo1();
		String s = new String();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a First-name : ");
		String fn = sc.next();// Ram

		System.out.println("Enter a last-name : ");
		String ln = sc.next();// ch

		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		System.out.println("Enter your fee info : ");
		double fee = sc.nextDouble();

		System.out.println("Enter your gender !!");
		char gen = sc.next().charAt(0);//Female
		

		// method call by value
		t3.getFullName(fn, ln);
		t3.getAge(age);
		t3.getFeeInfo(fee);

		t3.getGenderDetails(gen);

	}
}
