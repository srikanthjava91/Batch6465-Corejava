package com.oops;

//byte short int long float double 
public class TestLPDemo2 {

	void addition() {
		System.out.println("addition method called with no args ");
	}

	void addition(int i) {
		System.out.println("addition method called with int args " + i);
	}

	void addition(float i) {
		System.out.println("addition method called with float args " + i);
	}

	void addition(long i) {
		System.out.println("addition method called with long args " + i);
	}

//	void addition(int i, int j) {
//		System.out.println("addition method called with int int args " + i);
//	}

	void addition(float i, int j) {
		System.out.println("addition method called with float int args " + i);
	}

	void addition(int i, float j) {
		System.out.println("addition method called with int float args " + i);
	}
//
//	void addition(float i, float j) {
//		System.out.println("addition method called with float float args " + i);
//	}

	void main() {
		System.out.println("main method started ");

		addition();
		addition(10F);
//		addition(10, 20);

		System.out.println("main method ended  ");

	}

}
