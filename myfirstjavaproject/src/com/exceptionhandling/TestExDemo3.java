package com.exceptionhandling;

import java.io.File;

public class TestExDemo3 {

	public static void main(String[] args) {

		System.out.println("main method strated ");
		String name = "Srikanth";
		System.out.println(name.length());

		String name1 = "null";
		System.out.println(name1.length());

		try {
			String name2 = null;
			System.out.println(name2.length());// null dot any operation is NPE
		} catch (Throwable e) {
//			System.err.println(e.toString());
			e.printStackTrace();
		}

		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");
		System.out.println("main method ended ");

	}

}
