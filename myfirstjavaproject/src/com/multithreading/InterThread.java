package com.multithreading;

class Q {

	int num;

	public void put(int num) throws InterruptedException {
//		this.num = num;
		System.out.println("put: " + num);
	}

	public synchronized void get() throws InterruptedException {
		System.out.println("get: " + num);
	}
}

class Producer4 implements Runnable {

	Q q;

	Producer4(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			try {
				q.put(i++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}

		}

	}

}

class Consumer3 implements Runnable {
	Q q;

	Consumer3(Q q) {
		this.q = q;

		Thread t = new Thread(this, "Consumer");
		t.start();

	}

	@Override
	public void run() {
		while (true) {

			try {
				q.get();
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}

	}

}

public class InterThread {

	public static void main(String[] args) {
		Q q = new Q();
		Producer4 p = new Producer4(q);
		Consumer3 c = new Consumer3(q);

	}

}
