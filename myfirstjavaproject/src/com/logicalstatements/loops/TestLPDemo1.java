package com.logicalstatements.loops;

//1) WAP to print from 0 to 100 numbers ..? 
public class TestLPDemo1 {

	void main() {
		System.out.println("main method strated !!");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0 && i != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
