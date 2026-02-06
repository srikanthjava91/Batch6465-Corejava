package com.arrays;

//WAP to print sum of the elements in a given array and find avg ..?
public class TestArrDemo4 {

	public static void main(String[] args) {

		int[] marks = { 68, 65, 53, 74, 62, 46 };
		System.out.println(marks);// Address of the Object Array

		double sum = 0;
		double avg = 0;

//		for (int i = 0; i < marks.length; i++) {
//			sum = sum + marks[i];
//		}

		for (int m : marks) {
			sum = sum + m;
		}

		avg = sum / marks.length;
		System.out.println("find sum of the marks : " + sum);
		System.out.println("find avg of all the marks: " + avg);
	}
}
