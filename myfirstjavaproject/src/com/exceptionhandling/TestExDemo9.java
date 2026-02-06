package com.exceptionhandling;

public class TestExDemo9 {

	void method1() {

		return ;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		try {
			System.out.println("in try");
			System.out.println(10/0);
			return;
		} catch (Exception e) {
			System.err.println("in catch");
			System.err.println(e.getMessage());
		} finally {
			System.out.println("in finally !");
		}

		System.out.println("main method ended ");
	}
}
