package com.arrays;

//WAP combine two array into third array ..? 
public class TestArrDemo9 {

	public static void main(String[] args) {

		int[] a1 = { 10, 20, 30 };
		int a1Len = a1.length;

		int[] a2 = { 40, 50, 60 };
		int a2Len = a2.length;

		int[] a3 = new int[a1Len + a2Len];

		for (int i = 0; i < a1.length; i++) {
			a3[i] = a1[i];
		}

		for (int i = 0; i < a2.length; i++) {
			a3[a1Len + i] = a2[i];
		}

		for (int a : a3) {
			System.out.println(a);
		}

	}
}
