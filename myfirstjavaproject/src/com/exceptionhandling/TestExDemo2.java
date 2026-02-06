package com.exceptionhandling;

//No exception of type Object can be thrown; 
//an exception type must be a subclass of Throwable

public class TestExDemo2 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		
//		System.out.println(10/0);

		try {
			System.out.println("in try");
//			System.out.println(0.0 / 0.0);//NaN
//			System.out.println(0.0 / 0);//NaN
//			System.out.println(0 / 0);// AE : in catch / by zero
//			System.out.println(10.5 / 0);//Infinity
			System.out.println(100 / 0);//AE : in catch / by zero
		} catch (ArithmeticException e) {
			System.err.println("in catch ");
//			e.printStackTrace();
//			System.err.println(e.toString());
			System.err.println(e.getMessage());
		}
		System.out.println("main method ended");
	}
}
