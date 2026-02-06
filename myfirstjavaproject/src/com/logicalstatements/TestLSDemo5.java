package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo5 {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Matrimonial Consle based app ");

		Scanner sc = new Scanner(System.in);

		System.out.println("Can you please Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Can you please Enter Your assets & Salary info ");
		double assetsInfo = sc.nextDouble();
		System.out.println("Enter salary : ");
		double salary = sc.nextDouble();

		if (assetsInfo >= 50000000.00 || salary >= 2500000.00) {
			System.out.println("Okay !! We can proceed furthur ! Mr : " + name);

			System.out.println("Enter your age : ");
			int age = sc.nextInt();

			if (age > 26 && age <= 28) {
				System.out.println("Okay then Enter your Weight and Height !");

				System.out.println("Enter your weight :");
				double weight = sc.nextDouble();

				System.out.println("Enter your height : ");
				double height = sc.nextDouble();

				if ((weight > 65 && weight <= 70) && (height >= 5.3 && height <= 6.2)) {
					System.out.println("Okay !! We will proceed furthur We need more info ");

					System.out.println("Do you have siblings ..? If yes enter true or false");

					boolean sibStatus = sc.nextBoolean();

					if (!sibStatus) {
						System.out.println("Your profile almost matched with our requirments ");
					} else {
						System.out.println("Sorry !! ");
					}

				} else {
					System.out.println("You must need join Gym or else your height is not matching with out profile.");
				}

			} else {
				System.out.println("Sorry !! Your age is not matching with our profile ");
			}

		} else {
			System.out.println("Sorry !! You can leave for the day!");
		}

	}

}
