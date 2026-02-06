package com.oops;

public class TestDemo2 implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started !");
		TestDemo2 t1 = new TestDemo2();
		System.out.println(t1);

		TestDemo2 t2 = (TestDemo2) t1.clone();
		System.out.println(t2);
	}
}
