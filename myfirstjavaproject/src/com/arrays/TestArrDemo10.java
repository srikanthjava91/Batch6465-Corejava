package com.arrays;

public class TestArrDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		int[][] numbers = new int[5][5];//

		System.out.println(numbers.length);// 3
		System.out.println(numbers[0].length);// 3

		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;

		numbers[1][0] = 40;
		numbers[1][1] = 50;
		numbers[1][2] = 60;

		numbers[2][0] = 70;
		numbers[2][1] = 80;
		numbers[2][2] = 90;

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

		System.out.println("main method ended !");
	}
}
