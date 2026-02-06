package com.multithreading;

public class TestThreadDemo5 extends Thread {

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestThreadDemo5.currentThread().setPriority(6);
		System.out.println(TestThreadDemo5.currentThread());
		TestThreadDemo5 t1 = new TestThreadDemo5();
		t1.start();

		for (int i = 0; i <= 100; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method ended ");
	}

	@Override
	public void run() {
		TestThreadDemo5.currentThread().setPriority(1);
		System.out.println(TestThreadDemo5.currentThread());
		for (int i = 0; i <= 100; i++) {
			System.out.println("run : " + i);
		}
	}
}
