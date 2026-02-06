package com.logicalstatements.loops;

//2) WAP to print from 100 to 0 numbers ..? 
public class TestLPDemo2 {

	public static void main(String[] args) {
		System.out.println("main method strated !");
		for (int i = 100; i >= 0; i--) {
			if (i % 2 == 1 && i != 0) {
				System.out.print(i + " ");// 100 99 98 ..... 1 0
			}
		}
		System.out.println("Hi");
	}
}
