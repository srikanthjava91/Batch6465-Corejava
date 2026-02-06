package com.operators;

//6) Bitwise Operators 
//& | ^
//<< >> >>>
public class TestOpDemo9 {

	public static void main(String[] args) {
		System.out.println("Bitwise Operators demo ");

		System.out.println(true & true);// 1 & 1 = 1
		System.out.println(true & false);// 1 & 0 = 0
		System.out.println(false & true);// 0 & 1 = 0
		System.out.println(false & false);// 0 & 0 = 0

		System.out.println("Bitwise & AND");
		System.out.println(true | true);// 1 | 1 = 1
		System.out.println(true | false);// 1 |0 = 1
		System.out.println(false | true);// 0 | 1 = 1
		System.out.println(false | false);// 0 | 0 = 0
		System.out.println("********");

		System.out.println(26 & 56);// 24
		System.out.println(98 & 22);// 2
		System.out.println(43 & 14);// 10
		System.out.println(56 & 76);// 8

		System.out.println("Bitwise | OR");
		System.out.println(26 | 56);
		System.out.println(98 | 22);// 118
		System.out.println(43 | 14);// 47
		System.out.println(56 | 76);// 122

		System.out.println("Bitwise ^ XOR ");
		System.out.println(true ^ true);// 1 ^ 1 = 0
		System.out.println(true ^ false);// 1 |0 = 1
		System.out.println(false ^ true);// 0 | 1 = 1
		System.out.println(false ^ false);// 0 | 0 = 0

		System.out.println(26 ^ 56);
		System.out.println(98 ^ 22);//116
		System.out.println(43 ^ 14);//37
		System.out.println(56 ^ 76);//116

	}

}
