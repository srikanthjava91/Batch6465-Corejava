package com.arrays;

import java.util.Scanner;

public class TestArrDemo14 {

	static void reverseArray(int[] arr, int start, int end) {
		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}

	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many times to Rotate : ");
		int r = sc.nextInt();

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		// reverse method calling
		reverseArray(arr, 0, arr.length - 1);

		System.out.println("After Rotation : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}
}
