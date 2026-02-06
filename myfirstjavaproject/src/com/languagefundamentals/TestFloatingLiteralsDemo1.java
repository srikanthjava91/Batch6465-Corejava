package com.languagefundamentals;

//floating Literals 
public class TestFloatingLiteralsDemo1 {

	public static void main(String[] args) {
		float f1 = 100;// int --> float

//		CE: Type mismatch: cannot convert from double to float
//		float f2 = 35.5;//double --> float --> invalid 

		float f3 = 0123;// Octal --> int --> can convert to float

		// Type mismatch: cannot convert from double to float
//		float f4 = 0123.5;
		double d1 = 56.789;
		double d2 = 56.789F;
		
		float f5 = 0123.5F;
		float f6 = 123.5F;
		float f7 = 567.0F;
		float f8 = 0x123;
//		float f9 = 0x123.5F;//Invalid hex literal number
//		float f10 = 0x123.5;//invalid
		float f11 = 0xabc;

		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(f1);// 100.0
		System.out.println(f3);// 83.0
		System.out.println(f5);// 123.5
		System.out.println(f6);// 123.5
		System.out.println(f7);// 567.0
		System.out.println(f8);// 291.0
		System.out.println(f11);// 2748.0

	}
}
