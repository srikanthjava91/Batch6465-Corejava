package com.multithreading;

class ResourseQueue {

	int i = 0;
	boolean status = false;

	synchronized void put(int i) throws InterruptedException {
		while(status) {
			wait();
		}
		
		this.i = i;
		System.out.println("PUT : " + i);
		status = true;
		notify();
	}

	synchronized void get() throws InterruptedException {
		while(!status) {
			wait();
		}
		
		System.out.println("GET : " + i);
		status = false;
		notify();
	}
}

class Producer1 implements Runnable {
	ResourseQueue rq;

	public Producer1(ResourseQueue rq) {
		this.rq = rq;
		Thread t = new Thread(this, "Producer1");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {

			try {
				rq.put(i++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer1 implements Runnable {
	ResourseQueue rq;

	public Consumer1(ResourseQueue rq) {
		this.rq = rq;
		Thread t1 = new Thread(this, "Consumer1");
		t1.start();
	}

	@Override
	public void run() {

		while (true) {
			try {
				rq.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class InterThreadCommunication2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		ResourseQueue r = new ResourseQueue();
		Producer1 p1 = new Producer1(r);
		Consumer1 c1 = new Consumer1(r);

	}

}
