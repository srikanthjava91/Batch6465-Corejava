package com.multithreading;

public class TestThreadDemo2 extends Thread {

	public static void main(String[] args) {
		System.out.println("main method started ");

		TestThreadDemo2 t = new TestThreadDemo2();
		t.start();
//		t.start();
		t.run(10);

		for (int i = 0; i < 10; i++) {
			System.out.println("main : " + i);
		}

		System.out.println("main method ended ");
	}
	
//	@Override
//	public void start() {
//		// TODO Auto-generated method stub
//
//	}

	public void run(int i) {
		System.out.println("Hello run");
	}

	@Override
	public void run() {
		System.out.println("run method started ");
		for (int i = 0; i < 10; i++) {
			System.out.println("run : " + i);
		}
		System.out.println("run method ended ");
	}

}
