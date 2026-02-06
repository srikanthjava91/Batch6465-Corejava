package com.arrays;

// WAP to print the array in Reverse order ..?
public class TestArrDemo6 {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50, 60 };
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
	}
}
