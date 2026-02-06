package com.multithreading;

class Audio extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Audio : " + i);
		}
	}

}


class Video extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("video : " + i);
		}
	}

}

class Timer extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("timer : " + i);
		}
	}

}

//VLC 
public class TestVLC {

	public static void main(String[] args) {
		
		Audio a = new Audio();
		Video v = new Video();
		Timer t = new Timer();
		
		a.start();
		v.start();
		t.start();

	}

}
