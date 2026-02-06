package com.oops;

//child or sub or Derived 
public class PersonalLoan extends LoanImpl {

	public static void main(String[] args) throws Throwable {
		System.out.println("main method strated ");
		System.out.println("Welcome to Vcube Personal Loan Banking ");

		PersonalLoan pl = new PersonalLoan();
		double salary = pl.getCustomerSal();
		int cibil = pl.getCibilScore();
		boolean isValidCust = pl.isAadharAndPanValid();

		if (salary >= 800000.00 && cibil >= 750 && isValidCust) {
			System.out.println("Congrtualtions Your loan approved !! ");
			System.out.println("The Current ROI of PL is : " + pl.getROI());
			System.out.println("Can you enter your address details: ");
			String address = pl.getAddressDetails();

			System.out.println("Your enter address details are : " + "\n" + address);
		} else {
//			/Inconvenience
			System.out.println("Sorry for the Inconvenience caused, your loan got rejected ");
			System.out.println("Try your luck next time !! Thanks for your time ");
		}

	}

}
