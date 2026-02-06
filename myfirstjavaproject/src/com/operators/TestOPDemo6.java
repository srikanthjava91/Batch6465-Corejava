package com.operators;

public class TestOPDemo6 {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		System.out.println(x++);// 10 --> 11
		System.out.println(y++);// 20 --> 21
		System.out.println(++x);// 12
		System.out.println(x++);// 12 --> 13
		System.out.println(--x);// 12
		System.out.println(y--);// 21 --> 20
		System.out.println(x--);// 12 --> 11
		System.out.println(++y);// 21
		System.out.println(y++);// 21 -->22
		System.out.println(y--);// 21

		System.out.println(x - 5);// 6
		System.out.println(y - 10);// 11

		System.out.println("x value  : " + x);// 11
		System.out.println("y value : " + y);// 21

		System.out.println(x++ + y++ + ++x + --y);

	}

}
