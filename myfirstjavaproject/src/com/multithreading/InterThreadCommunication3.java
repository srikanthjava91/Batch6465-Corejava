package com.multithreading;


class TestResource{
	int i=0;
	boolean status=false;
	synchronized 	public void put(int i) throws InterruptedException{
		while(status) {
			wait();
		}
		this.i=i;
		System.out.println("put:"+i);
		status=true;
		notify();


	}
	synchronized 	public void get() throws InterruptedException {

		while(!status) {
			wait();
		}
		System.out.println("get:"+i);
		status=false;
		notify();

	}

}
class producer3 implements Runnable{
	TestResource r;
	producer3(TestResource r){
		this.r=r;
		Thread a=new Thread(this,"producer3");
		a.start();

	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			try {
				r.put(i++);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
class consumer3 implements Runnable{
	TestResource r;

	consumer3(TestResource r){
		this.r=r;
		Thread a=new Thread(this,"consumer3");
		a.start();
	}
	@Override
	public void run() {
		while(true) {

			try {
				r.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class InterThreadCommunication3 {

	public static void main(String[] args) {
		TestResource r=new TestResource();
		producer3 p=new producer3 (r); 
		consumer3 c=new  consumer3(r);
	}

}
