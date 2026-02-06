package com.arrays;

//3D Arrays 
public class TestArrDemo17 {

	public static void main(String[] args) {
		int[][][] arr = new int[3][3][3];// 0 1 2 --> 0 1 --> 0 1

//		System.out.println(arr.length);// 3
//		System.out.println(arr[0].length);// 2
//		System.out.println(arr[0][0].length);// 2

		arr[0][0][0] = 10;
		arr[1][1][1] = 100;
		arr[2][2][2] = 1000;

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				for (int k = 0; k < arr[i][j].length; k++) {
//					System.out.print(arr[i][j][k] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}

		for (int[][] a2 : arr) {
			for (int[] a1 : a2) {
				for (int a : a1) {
					System.out.print(a + " ");
				}
				System.out.println();
			}
			System.out.println("");
		}

	}

}
