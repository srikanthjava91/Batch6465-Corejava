package com.multithreading;

public class TestThreadDemo1 extends Thread {

	public static void main(String[] args) {
		System.out.println("main method started !");
		System.out.println(Thread.currentThread());

		TestThreadDemo1 t1 = new TestThreadDemo1();
		t1.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method ended !");

	}

	@Override
	public void run() {
		System.out.println("hello method strated !!");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("hello : " + i);
		}
		System.out.println("hello method ended !!");
	}

}
