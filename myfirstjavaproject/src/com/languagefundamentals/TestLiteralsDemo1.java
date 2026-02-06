package com.languagefundamentals;


//Integral Literals 
public class TestLiteralsDemo1 extends Object {

	public static void main(String[] args) {

		TestLiteralsDemo1 t1 = new TestLiteralsDemo1();
		System.out.println(t1);
		System.out.println(t1.hashCode());
		int ab = 0x372f7a8d;
		System.out.println(ab);//

		// Decimal Literals
		int a1 = 123;
		int a2 = 56789;
		int a3 = 789;

		// Any number starts with 0 will consider as Octal number.
		// Base is 8 and we can represent 0 to 7 values.
		int a4 = 0123;
//		 1*8^2 +2*8^1 +3*8^0  --> 64 + 16 + 3 = 83

		int a5 = 0345;// 229
		int a6 = 0567;// 375
//		int a7 = 0876;//574//The literal 0876 of type int is out of range 

		// Any number starts with 0x or 0X will consider as Hexa-Decimal number
		// Base is 16 and we can represent 0 to 9 and a-f/ A-F
		// a=10, b=11, c=12, d=13, e=14, f =15
		int a8 = 0x123;

		int a9 = 0x45a;// 1114
		int a10 = 0Xabc;// 2748
		int a11 = 0Xbee;// 3054
		int a12 = 0xDAD;// 3501

//		1*16^2   +2*16^1  +3*16^0 = 256 + 32 + 3 = 291 

		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a11);
		System.out.println(a12);
		System.out.println("***************");

		System.out.println(a1);// 123
		System.out.println(a2);// 56789
		System.out.println(a3);// 789
		System.out.println(a4);// 83

		System.out.println(a5);
		System.out.println(a6);
//		System.out.println(a7);
		System.out.println(a8);

	}

}
