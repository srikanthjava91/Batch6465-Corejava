package com.arrays;

import java.util.HashSet;
import java.util.Set;

//Q WAp to print duplicate elements : Brute force methodology 
public class TestArrDemo16 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		int[] arr = { 1, 2, 3, 2, 1, 4, 2, 2, 2 };

		Set<Integer> s = new HashSet<>();
		System.out.println(s);
		for (int a : arr) {
			if (!s.add(a)) {
				System.out.println(a);
			}
		}

		System.out.println(s);

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.println(arr[i]);
//				}
//			}
//		}
	}
}
