package com.multithreading;

class TestDemo6 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield();
			System.out.println("Child Thread");
		}
	}
}

public class ThreadYieldDemo {

	public static void main(String args[]) {

		TestDemo6 t = new TestDemo6();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
