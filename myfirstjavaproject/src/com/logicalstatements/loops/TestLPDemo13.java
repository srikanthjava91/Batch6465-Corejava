package com.logicalstatements.loops;

public class TestLPDemo13 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println("Hello " + i);
		}
		System.out.println("********");
		for (int i = 0; i < 10; i++) {
			if (i == 5 || i == 6 || i == 7) {
				continue;
			}
			System.out.println("Hello " + i);
		}
	}
}
