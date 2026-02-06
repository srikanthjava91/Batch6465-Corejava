package com.arrays;

import java.util.Scanner;

public class TestArrDemo15 {

	static void arrayRotationRtoL(int[] arr, int r) {

		int s = 0;
		int e = arr.length - 1;
//		Step1 : Reverse Given array 
		reverseArray(arr, s, e);

//		Step2 : Reverse First half Array based on r value 
		reverseArray(arr, s, r - 1);

//		Step3 : Reverse Second half Array based on r value 
		reverseArray(arr, r, e);

	}

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
		System.out.println("Before Rotation : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

		System.out.println();
		arrayRotationRtoL(arr, r);

		System.out.println("After Rotation : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
