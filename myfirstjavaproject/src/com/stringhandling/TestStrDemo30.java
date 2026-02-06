package com.stringhandling;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestStrDemo30 {

	static Scanner sc = new Scanner(System.in);

	void main(String[] args) {

		if (isAadharValidated() && isPANValidated() && isPhoneNumberValid()) {
			System.out.println("You are Authenticated SUccessfully !!");
		} else {
			System.out.println("Something went wrong with your KYC !!");
		}

	}
	
	boolean isPhoneNumberValid() {
		System.out.println("Enter phone number: ");
		String phone = sc.next();
		return Pattern.matches("^[6-9]{1}[0-9]{9}$", phone);
	}

	boolean isAadharValidated() {
		System.out.println("Enter your AADHAR number !");
		String aadhaar = sc.next();
		return Pattern.matches("^[0-9]{12}$", aadhaar);
	}

	boolean isPANValidated() {
		System.out.println("ENter your PAN Details : ");
		String pan = sc.next();
		return Pattern.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$", pan);
	}

}
