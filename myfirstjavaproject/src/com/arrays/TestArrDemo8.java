package com.arrays;

import java.util.Scanner;

public class TestArrDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();// 5

		String[] names = new String[size];// 0 1 2 3 4
		sc.nextLine();
		for (int i = 0; i < size; i++) {
			names[i] = sc.nextLine();
		}

		for (String name : names) {
			System.out.println(name);
		}

	}

}
