package com.logicalstatements.patterns;

public class TestPTDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 6; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
