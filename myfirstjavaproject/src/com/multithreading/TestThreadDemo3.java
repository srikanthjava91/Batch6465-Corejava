package com.multithreading;

public class TestThreadDemo3 implements Runnable {

	public static void main(String[] args) {
		System.out.println("main method started !");

		TestThreadDemo3 r = new TestThreadDemo3();
		new Thread(r).start();
		new Thread(r).start();

		for (int i = 0; i <= 20; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method ended !!");

	}

	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("run : " + i);
		}
	}
}
