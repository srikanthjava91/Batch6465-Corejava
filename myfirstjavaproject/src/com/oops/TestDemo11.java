package com.oops;

public class TestDemo11 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		addition("");
		addition("",10);
		addition("",10, 20);
		addition("",10, 20, 30);
		addition("",10, 20, 30, 40);
		addition("",10, 20, 30, 40, 50);

	}

	public static void addition(String s,long... i) {
		long sum = 0;
		for (long e : i) {
			sum = sum + e;
		}
		System.out.println("sum : " + sum);
	}

}
