package com.langfun.methods;

import java.util.Scanner;

//method with return type + with arguments  

//Rectangle --> Length * breadth 
//Circle --> PI * radius * radius
//Triangle --> 0.5 * base * height
//Square --> side * side 

//WAP to find area of Rectangle,Circle, Triangle,Square..? 
public class TestDemo7 {

	static double findAreaOfRectangle(double l, double b) {
		double arRec = l * b;
		return arRec;
	}

	static double findAreaOfTriangle(double b, double h) {
		return 0.5 * b * h;
	}

	static double findAreaOfCircle(double radius) {
		return Math.PI * radius * radius;
	}

	static double findAreaOfSquare(double side) {
		return side * side;
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		Scanner s = new Scanner(System.in);

		System.out.println("Finding area of rectangle !");
		System.out.println("Enter  length : ");
		double length = s.nextDouble();

		System.out.println("Enter breadth : ");
		double breadth = s.nextDouble();

		double arRec = findAreaOfRectangle(length, breadth);
		System.out.println("Area of Rectangle : " + arRec);
		System.out.println("******************************************");

		System.out.println("Finding area of Triangle");
		System.out.println("Enter Base ");
		double base = s.nextDouble();

		System.out.println("Enter a Height ");
		double height = s.nextDouble();

		double arTri = findAreaOfTriangle(base, height);
		System.out.println("Area of Triangle " + arTri);
	
		System.out.println("******************************************");

		System.out.println("Finding area of Circle ");
		System.out.println("Enter radius : ");
		double r = s.nextDouble();
		double arCir = findAreaOfCircle(r);
		System.out.println("Area of Circle is : " + arCir);
		System.out.println("******************************************");
		
		System.out.println("Finding area of Square : ");
		System.out.println("Enter side value : ");
		double side = s.nextDouble();
		double arSqu = findAreaOfSquare(side);
		System.out.println("Area of Square : " + arSqu);
		System.out.println("***************************************");
		
		
		System.out.println("main method ended !");

	}

}
