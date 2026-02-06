package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLPDemo23 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		String yn = "";

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number !!");
			int n1 = sc.nextInt();

			System.out.println("Enter a number !!");
			int n2 = sc.nextInt();

			System.out.println("Enter a symbol to proceed for calculation :  !!");
			String symb = sc.next();

			switch (symb) {
			case "+" -> System.out.println("sum : " + (n1 + n2));
			case "-" -> System.out.println("Diff : " + (n1 - n2));
			case "*" -> System.out.println("product : " + (n1 * n2));
			case "/" -> System.out.println("qotient : " + (n1 / n2));
			case "%" -> System.out.println("reminder:  " + (n1 % n2));
			default -> System.out.println("Invalid symbol !");
			}

			System.out.println("Do you want to continue ..? Click Y for Yes N for No : ");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("Y"));

	}
}
