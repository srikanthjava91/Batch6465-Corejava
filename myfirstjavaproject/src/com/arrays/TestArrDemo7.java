package com.arrays;

import java.util.Scanner;

// WAP to read the elements from scanner ..? 
public class TestArrDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size : ");
		int size = sc.nextInt();// 5
		int[] arr = new int[size];// 5 --> 0 1 2 3 4

		System.out.println("Enter elements : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array representation : ");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}

		// for each loop
//		for (int a : arr) {
//			System.out.print(a + " ");
//		}

	}

}
