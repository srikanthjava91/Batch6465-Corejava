package com.stringhandling;

class Dog {

}

public class TestStrBufDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !!");

		// Type mismatch: cannot convert from String to StringBuffer
//		StringBuffer sb1 = "Hello";
//		System.out.println(sb1);//

//		Dog d ="Puppy";
//		System.out.println(d);

		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println("main method ended !!");

	}

}
