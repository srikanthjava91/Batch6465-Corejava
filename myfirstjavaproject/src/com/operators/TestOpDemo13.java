package com.operators;

import java.util.Scanner;

public class TestOpDemo13 {

	public static void main(String[] args) {

		System.out.println("main method strated ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name1  : ");
		String name1 = sc.nextLine();

		System.out.println("Enter name2  : ");
		String name2 = sc.nextLine();

		String strMax = (name1.length() > name2.length()) ? name1 : name2;

		System.out.println("String Max : " + strMax);

	}

}
