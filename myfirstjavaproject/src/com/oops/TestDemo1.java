package com.oops;

//Implicit Single Inheritance 
public class TestDemo1 implements Cloneable {
	int i1 = 10;
	String name1 = "Srikanth";

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method started !");

		TestDemo1 t1 = new TestDemo1();
		System.out.println(t1);
		System.out.println(t1.hashCode());
		System.out.println(t1.i1);
		System.out.println(t1.name1);

		int a1 = 0x1dbd16a6;
		System.out.println(a1);

		Object t2 = t1.clone();
		System.out.println(t2);

	}
}
