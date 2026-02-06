package com.languagefundamentals;

/*Note : String Literals are Storing in SCP : 
SCP : String Constant Pool */

public class TestLiteralsDemo2 {

	public static void main(String[] args) {

		String s = "Java";// String Literals
		String s5 = "Java";
		String s1 = "Srikanth";// String Literals
		String s2 = null;// null literals
		String s3 = "";// String Literals

		// String Object
		String s4 = new String("Java Vcube");
		String s6 = new String("Java Vcube");

		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s2);
		System.out.println(s4);

	}

}
