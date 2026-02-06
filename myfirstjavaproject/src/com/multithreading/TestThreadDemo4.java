package com.multithreading;

public class TestThreadDemo4 extends Thread {

	public static void main(String[] args) {
		System.out.println("main method staretd ");
		TestThreadDemo4 t1 = new TestThreadDemo4();

		t1.start();

		TestThreadDemo4.currentThread().setName("t1");
		System.out.println(TestThreadDemo4.currentThread());
		System.out.println("Name : " + TestThreadDemo4.currentThread().getName());

		System.out.println("main method ended ");
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("t2");
		System.out.println("Name : " + Thread.currentThread().getName());
	}
}
