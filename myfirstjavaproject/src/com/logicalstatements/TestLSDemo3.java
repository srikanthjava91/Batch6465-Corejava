package com.logicalstatements;

import java.util.Scanner;

//if else-if 
//WAP to print the grade based on your marks Percentage ..? 

//input : 94.0%
//output : Grade A

//input : 74.0%
//output : Grade C

//input : 64.0%
//output : Grade D

//input : 84.0%
//output : Grade B

//input : 34.0%
//output : Failed

//input : 120%
//output : Invalid Marks 
public class TestLSDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Marks Percentage % ");
		double marksP = sc.nextDouble();

		if (marksP > 100 || marksP < 0) {
			System.out.println("inavlid marks !!");
		} else if (marksP >= 90) {
			System.out.println("Grade A");
		} else if (marksP >= 80) {
			System.out.println("Grade B");
		} else if (marksP >= 70) {
			System.out.println("Grade C");
		} else if (marksP >= 60) {
			System.out.println("Grade D");
		} else if (marksP >= 35) {
			System.out.println("Just Passed");
		} else {
			System.out.println("Failed");
		}

		System.out.println("main method ended !!");

	}

}
