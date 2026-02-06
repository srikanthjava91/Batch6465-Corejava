package com.operators;

//Logical Operators --> && || !
//Bitwise Operators --> & | ^ 
public class TestOpDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		int x = 100;
		int y = 2000;
		int z = 500;

		System.out.println("*************** !");
		System.out.println(!(x > y));//
		System.out.println("***************");

		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("**************** || ***********");
		System.out.println(x < y || y > z);// true
		System.out.println(x < y || y < z);// true
		System.out.println(x > y || y > z);// true
		System.out.println(x > y || y < z);// false

		System.out.println("**************************&&");
		System.out.println(true && true && true);// true
		System.out.println(true && false && true);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		System.out.println("****************&& ***********");
		System.out.println(100 < 2000 && 100 < 500 && 2000 > 500);// true
		System.out.println(x < y && x < z && y > z);// true
		System.out.println(x > y && x < z && y > z);// false
		System.out.println(x > y && x > z);// false
		System.out.println(x < y && y < z);// false

	}
}
