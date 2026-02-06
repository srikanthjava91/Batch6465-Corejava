package com.multithreading;

class SThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("run ...");
		}
	}
}

public class TestThreadDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		SThread s1 = new SThread();
		s1.start();
		s1.interrupt();

		System.out.println("main method started ");
	}

}
