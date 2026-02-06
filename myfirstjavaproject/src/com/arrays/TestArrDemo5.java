package com.arrays;

//Q) WAP to print min and max value from an array ..?
public class TestArrDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] numbers = { 10, 25, 12, 5, 56, 6, 2 };

		int min = numbers[0];// 10 5 2
		int max = numbers[0];// 10 25 56

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			} else if (numbers[i] > max) {
				max = numbers[i];
			}
		}

//		for (int n : numbers) {
//			if (n < min) {
//				min = n;
//			} else if (n > max) {
//				max = n;
//			}
//		}

		System.out.println("minimim value from an array : " + min);
		System.out.println("Maximum value from an array : " + max);

	}

}
