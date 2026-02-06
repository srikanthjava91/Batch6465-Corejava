package com.logicalstatements.loops;

public class TestLPDemo14 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main method started !");
		int a = 10;
		while (a > 5) {
			System.out.println("Hello ");
			Thread.sleep(1000);
			a--;
		}
	}
}
