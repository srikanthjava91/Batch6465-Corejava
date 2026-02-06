package com.arrays;

public class TestArrDemo18 {

	public static void main(String[] args) {

		int[][][][] numbers = { { { { 10, 20, 30 }, { 40, 50 }, { 60 } }, { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9 } } },
				{ { { 10, 10 } } } };
		System.out.println(numbers);

		for (int[][][] a3 : numbers) {
			for (int[][] a2 : a3) {
				for (int[] a1 : a2) {
					for (int a : a1) {
						System.out.print(a + " ");
					}
					System.out.println();
				}
				System.out.println();
			}
			System.out.println("");
		}
	}
}
