package com.stringhandling;

import java.util.Scanner;

//WAP to find max occurrences from a given String ..?
//input : aaabbcccc 
//output : c 
public class TestStrDemo32 {

	public static void main(String[] args) {

		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();// abbccc
		int[] arr = new int[127];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		int max = -1;
		char c = ' ';

		for (int i = 0; i < str.length(); i++) {
			if (max < arr[str.charAt(i)]) {
				max = arr[str.charAt(i)];
				c = str.charAt(i);
//				System.out.println(str.charAt(i) +":" +max);
			}
		}

		System.out.println("Max Occrrences char is : " + c);

	}

}
