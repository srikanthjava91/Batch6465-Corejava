package com.arrays;

public class TestArrDemo13 {

	public static void main(String[] args) {
		System.out.println("main method strated ");
		int[] arr = { 10, 9, 15, 25, 3, 8, 5 };
		int temp = 0;

		System.out.println("Before Sorting ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;// 0 1 4
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		System.out.println("after Sorting ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
