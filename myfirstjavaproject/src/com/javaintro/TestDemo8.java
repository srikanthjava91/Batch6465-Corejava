package com.javaintro;

public class TestDemo8 {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		// 372f7a8d --> null
		TestDemo8 t = new TestDemo8();

		// 2f92e0f4 --> 372f7a8d
		TestDemo8 t1 = new TestDemo8();
		// 28a418fc --> 2f92e0f4
		TestDemo8 t2 = new TestDemo8();
		// 28a418fc
		TestDemo8 t3 = new TestDemo8();
		t3 = t2;
		

		t = new TestDemo8();

		System.gc();

		System.out.println(t);// Address of the Object
		System.out.println(t1);// Address of the Object
		System.out.println(t2);// Address of the Object
		System.out.println(t3);
		
		t = null;

		System.out.println("main method ended !");

	}

}
