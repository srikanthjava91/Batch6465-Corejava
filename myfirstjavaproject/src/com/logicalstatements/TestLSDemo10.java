package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter category ");
		String catg = sc.next();

		switch (catg) {

		case "fr" -> {
			System.out.println("Enter fruit name :");
			String item = sc.next();
			switch (item) {
			case "bnn" -> System.out.println("Banana the cost is " + 100 + "rs");
			case "orn" -> System.out.println("Orange the cost is " + 150 + "rs");
			case "mng" -> System.out.println("Mango the cost is " + 400 + "rs");
			case "apl" -> System.out.println("Apple the cost is " + 600 + "rs");
			default -> System.out.println("Item is out of stock !");
			}

		}

		case "veg" -> {
			System.out.println("Enter Vegetable name : ");
			String item = sc.next();
			switch (item) {
			case "tmt" -> System.out.println("Tomato " + 40 + "rs");
			case "ptt" -> System.out.println("Potato " + 60 + "rs");
			case "bnd" -> System.out.println("Bendi " + 80 + "rs");
			case "drm" -> System.out.println("Drumsticks " + 60 + "rs");
			default -> System.out.println("Item is out of stock !");
			}
		}

		default -> System.out.println("Enter category is not available from our end");

		}

	}

}
