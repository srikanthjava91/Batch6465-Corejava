package com.arrays;

public class TestArrDemo1 {

	public static void main(String[] args) {

		// Declaration
		int[] numbers;

		// Creation
		numbers = new int[5];// 0 1 2 3 4

		// Assignment
		numbers[0] = 10;
		numbers[1] = 20;

		// Representation
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
