package com.stringhandling;

public class TestStrDemo18 {
	int id = 101;
	String name = "Laya";

	@Override
	public String toString() {
		return "Info : ID : " + id +" Name : " + name;
	}

	public static void main(String[] args) {
		System.out.println("main method strated  !");
		TestStrDemo18 t = new TestStrDemo18();
		System.out.println(t);
		System.out.println(t.toString());// 1dbd16a6

		int a = 0x1dbd16a6;
		System.out.println(a);
		System.out.println(System.identityHashCode(t));
		System.out.println(t.hashCode());

		String s = new String("sri");// s r i
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		System.out.println(System.identityHashCode(s));
		System.out.println("main method ended !");
	}

}
