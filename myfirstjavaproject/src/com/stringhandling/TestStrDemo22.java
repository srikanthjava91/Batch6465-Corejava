package com.stringhandling;

public class TestStrDemo22 {

	void main(String[] args) {

		add(10);
		add(10, 20);
		add(10, 20, 30);
		add(10, 20, 30, 40);
		add(10, 20, 30, 40, 50);
	}

	void add(int... a) {
		int sum = 0;
		for (int n : a) {
			sum = sum + n;
		}
		System.out.println("sum : " + sum);
	}

}
