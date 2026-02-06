package com.arrays;

public class TestArrDemo2 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

//		int a;
//		System.out.println(a);//The local variable a may not have been initialized

		int[] numbers = new int[5];// 0 1 2 3 4
		System.out.println(numbers);// Address of the Array

		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
//		numbers[5] = 60;

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("main method ended ");
	}
}
