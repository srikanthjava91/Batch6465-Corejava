package com.oops;

import java.util.Scanner;

//Parent or Super or Base or Utility class 
public class LoanImpl implements Loan {

	static Scanner sc = new Scanner(System.in);

	public String getAddressDetails() {
		String address = "";

		System.out.println("Enter your flat number :");
		String flat = sc.next();
		System.out.println("Enter Your plot Details : ");
		String plot = sc.nextLine();

		System.out.println("Enter your Street Name : ");
		String street = sc.nextLine();
		System.out.println("Enter your city : ");
		String city = sc.next();
		System.out.println("ENt PIN : ");
		long pin = sc.nextLong();

		address = "Flat no : " + flat + "Plot name: " + plot + "Street Name:" + street + "City name: " + city
				+ "PIN code : " + pin;

		return address;

	}

	public boolean isAadharAndPanValid() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Aadhar Number: ");
		String aadhar = sc.nextLine();

		// Aadhar should be exactly 12 digits
		if (!aadhar.matches("\\d{12}")) {
			System.out.println("❌ Invalid Aadhar Number! It must contain exactly 12 digits.");
			return false;
		}

		System.out.println("Enter your PAN Number: ");
		String pan = sc.nextLine();

		// PAN format: 5 letters + 4 digits + 1 letter (e.g. ABCDE1234F)
		if (!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("❌ Invalid PAN Number! Format should be like ABCDE1234F.");
			return false;
		}

		System.out.println("✅ Aadhar and PAN details are valid!");
		return true;
	}

	public Object welcome() {
		return "welcome";
	}

	public Number getROI() throws Exception {
		return 9.5;
	}

	public int getCibilScore() {
		System.out.println("Enter your cibil info : ");
		int cibil = sc.nextInt();
		return cibil;
	}

	public double getCustomerSal() {
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

}
