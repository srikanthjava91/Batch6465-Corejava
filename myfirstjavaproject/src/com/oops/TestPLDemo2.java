package com.oops;

import java.util.Scanner;

//WAP to find Areas of Rectangle, Triangle, Circle and Square..? 

//Rectangle : length * breadth 
//Triangle  : 0.5 base * height 
//Circle 	: PI * r* r
//Square 	: side * side 

public class TestPLDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);

		System.out.println("*********** Recatngle area**********");
		System.out.println("Enter a length : ");
		long length = sc.nextLong();
		System.out.println("Enter a breadth : ");
		long breadth = sc.nextLong();
		System.out.println("Rectangle Area : " + findArea(length, breadth));

		System.out.println("*********Square area *************");
		System.out.println("Enter a Side : ");
		int side = sc.nextInt();
		System.out.println("Square Area : " + findArea(side));

		System.out.println("************** radius area ");
		System.out.println("ENter radius : ");
		double radius = sc.nextDouble();
		System.out.println("Circle Area: " + findArea(radius));

	}

	static double findArea(long len, long breadth) {
		return len * breadth;
	}

	static double findArea(int side) {
		return side * side;
	}

	static double findArea(double radius) {
		return Math.PI * radius * radius;
	}

}
