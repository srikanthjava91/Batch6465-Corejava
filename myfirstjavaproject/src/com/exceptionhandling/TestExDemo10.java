package com.exceptionhandling;

import java.util.Scanner;

public class TestExDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("in try ");
//			System.out.println(10 / 0);
			System.exit(0);

		}

//		System.out.println("Hello");

		catch (ArithmeticException e) {
			System.err.println("in catch ");
			System.err.println(e.getMessage());
		}

		catch (Exception e) {
			System.err.println("in catch ");
			System.err.println(e.getMessage());
		}

		finally {
			System.out.println("in finally !");
			sc.close();
		}

		System.out.println("main method ended ");
	}

}
