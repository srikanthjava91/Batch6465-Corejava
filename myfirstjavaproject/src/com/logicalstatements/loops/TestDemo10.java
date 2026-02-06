package com.logicalstatements.loops;

// WAP to swap numbers using temp & with out using temp ..? 
public class TestDemo10 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");
		int x = 10;
		int y = 20;

		x = x + y;// 30
		y = x - y;// 30-20 = 10
		x = x - y;// 30 -10 = 20

		System.out.println("X value : " + x);
		System.out.println("Y value : " + y);

		int a = 10;
		int b = 20;
		int temp = 0;

		temp = a;
		a = b;
		b = temp;

		System.out.println("A value : " + a);// 20
		System.out.println("B value : " + b);// 10

	}
}
