package com.arrays;

public class TestArrDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8 } };
		System.out.println(numbers);

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

//		for (int[] n1 : numbers) {
//			for (int number : n1) {
//				System.out.print(number + " ");
//			}
//			System.out.println();
//		}
		System.out.println("main method ended ");
	}
}
