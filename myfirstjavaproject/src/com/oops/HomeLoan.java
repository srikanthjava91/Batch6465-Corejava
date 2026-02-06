package com.oops;

import java.io.IOException;

//Child or sub or Derived 
public class HomeLoan extends LoanImpl {

	void getDocmentInfo() {
		System.out.println("All the documents submitted successfully !");
	}

	void homeLoanBasicInfo() {
		System.out.println("House Loan can help to reduce your tax under 80C section!!");
	}

	public Double getROI() throws Exception {
		return 8.0;
	}

//	String welcome() {
//		return "welcome to Java ";
//	}

	public static void main(String[] args) throws Exception {
		System.out.println("main method strated ");
		System.out.println("Welcome to Vcube Home Loan Banking ");

//		1) By using, Child Object Child reference, 
//		we can access both child & Parent class functionalities.
		HomeLoan hl = new HomeLoan();
		hl.getDocmentInfo();
		hl.homeLoanBasicInfo();

//		2) By using, Parent Object & Parent reference,
//		We can access only Parent class functionalities.
		LoanImpl l1 = new LoanImpl();
		System.out.println(l1.getClass());

		// Up-casting means, Storing child object into parent reference we can consider
		// as Up-casting.
		// By Using up-casting, we will achieve abstraction in java and we can achieve
		// dynamic Dispatching.
//		3) By using child Object & parent reference 
//		We can access Only Parent class functionalities 
		LoanImpl l2 = new HomeLoan();// This process is called Up-casting

//		4) By using Parent Object,Child Reference we cannot create Object directly 
//		and we will get Compile time error like 
//		Type mismatch: cannot convert from LoanImpl to HomeLoan
//		Down-Casing is not possible in java directly but it is possible with Explicit type casting
//		So, we can access both parent and child functionalities but, when you run the program, 
//		we will get a exception name called ClassCastException at Runtime.
//		HomeLoan hl1 = (HomeLoan) new LoanImpl();
//		hl1.getDocmentInfo();

		double salary = hl.getCustomerSal();
		int cibil = hl.getCibilScore();
		boolean isValidCust = hl.isAadharAndPanValid();

		if (salary >= 600000.00 && cibil >= 700 && isValidCust) {
			System.out.println("Congrtualtions Your Home loan gor approved !! ");
			System.out.println("The Current ROI of hl is : " + hl.getROI());
			System.out.println("Can you enter your address details: ");
			String address = hl.getAddressDetails();

			System.out.println("Your enter address details are : " + "\n" + address);
		} else {
//			/Inconvenience
			System.out.println("Sorry for the Inconvenience caused, your loan got rejected ");
			System.out.println("Try your luck next time !! Thanks for your time ");
		}

	}

}
