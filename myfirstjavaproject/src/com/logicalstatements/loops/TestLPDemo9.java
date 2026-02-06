package com.logicalstatements.loops;

// Fibonacci Series : 0 1 1 2 3 5 8 13 21 
public class TestLPDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		int n1 = 0;
		int n2 = 1;

		int n3 = 0;
		System.out.print(n1 + " " + n2 + " ");

		for (int i = 1; i <= 10 - 2; i++) {
			n3 = n1 + n2;// 0 + 1 = 1 --> 1+1 =2 --> 1+ 2= 3--> 2+3= 5 --> 3 + 5 = 8
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}

}
