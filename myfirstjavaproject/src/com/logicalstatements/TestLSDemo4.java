package com.logicalstatements;

import java.util.Scanner;

//nested if else 
public class TestLSDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Did you complete the Fee ..? ");
		boolean isFeeCleard = sc.nextBoolean();

		if (isFeeCleard) {
			System.out.println("You are entering to the class room !!");
			System.out.println("Did you attend the lab today ? ");
			boolean didYouAttendLabToday = sc.nextBoolean();

			if (didYouAttendLabToday) {
				System.out.println("You will get the recordings by EOD day around 11'o clck ");
			} else {
				System.out.println("You will not receive the Recording classes");
				System.out.println(
						"From Next time onwards, take the permission from Vishwanth sir, Srikanth Sir & HR team ");
			}

		} else {
			System.out.println("Connect to HR Team for updating due date ");
		}

	}
}
