package com.operators;

public class TestOpDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		int a = 5;// 6
		int b = 6;// 5

		System.out.println(a++ + b-- + ++b + a++);// 23
		
//		8+ 6 = 14 --> a=8 b = 7
//		6 + 8 = 14 --> a=7 b= 6
//		7 + 7 = 14 
		System.out.println(++a + b++ + --b + a-- + a++ + ++b);// 43 42
		System.out.println("A value : " + a);// 7
		System.out.println("B value : " + b);// 6

	}

}
