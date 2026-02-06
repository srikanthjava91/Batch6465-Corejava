package com.arrays;

public class TestArrDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[] arr = { 4, 3, 2 };
		int temp = 0;

		System.out.println("Before Sorting ************");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			boolean swapped = false;

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}

			}
			if (!swapped) {
				break;
			}
		}

		System.out.println("after Sorting ************");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}
}
