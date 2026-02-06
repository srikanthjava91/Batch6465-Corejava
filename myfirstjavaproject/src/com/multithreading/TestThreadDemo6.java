package com.multithreading;

class JThread1 extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			System.out.println("Jthread1  : " + i);
			sum = sum + i;
		}
		System.out.println("******Sum of JThread1 : " + sum);
	}
}

class JThread2 extends Thread {

	JThread3 j3;

	JThread2(JThread3 j3) {
		this.j3 = j3;
	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			if (i == 75) {
				try {
					j3.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Jthread2  : " + i);
			sum = sum + i;
		}
		System.out.println("******Sum of JThread2 : " + sum);
	}
}

class JThread3 extends Thread {
	@Override
	public void run() {
		int sum = 0;
		for (int i = 100; i <= 150; i++) {
			System.out.println("Jthread3  : " + i);
			sum = sum + i;
		}
		System.out.println("******Sum of JThread3 : " + sum);
	}
}

public class TestThreadDemo6 {

	public static void main(String[] args) {

		JThread1 j1 = new JThread1();
		JThread3 j3 = new JThread3();
		JThread2 j2 = new JThread2(j3);

		j1.start();
		j2.start();
		j3.start();

	}

}
