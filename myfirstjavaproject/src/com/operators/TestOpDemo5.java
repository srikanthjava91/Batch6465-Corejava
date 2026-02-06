package com.operators;

//4) Unary Operators 
//	+ - ++ -- 

//Pre or Post Increment / Decrement 
//++ 
//-- 
public class TestOpDemo5 {

	public static void main(String[] args) {

		int a = 5;
		int b = 6;

		System.out.println(a++);// 5 --> 6
		System.out.println(++a);// 7
		System.out.println(--a);// 6
		System.out.println(++a);// 7
		System.out.println(a++);// 7--> 8
		System.out.println(a--);// 8 --> 7
		System.out.println(b++);// 6 --> 7
		System.out.println(++b);// 8
		System.out.println(--b);// 7

		System.out.println("A value : " + a);// 7
		System.out.println("B value : " + b);// 7

	}

}
