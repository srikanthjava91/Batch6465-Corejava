package com.java8features;

public class TestJ8Demo9 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Thread t = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i <= 10; i++) {
					System.out.println("run : " + i);
				}
			}
		};

		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main : " + i);
		}

	}

}
