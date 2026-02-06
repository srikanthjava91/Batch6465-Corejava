package com.languagefundamentals;

public class TestDataTypesDemo1 {

//	1 byte = 8 bits = -128 to 127 
//	if we store more that byte value, we will get CE.
//	Type mismatch: cannot convert from int to byte
//	Note : By default, all RHS numbers are considering as int.

	byte b = (byte) 257;// Explicit type casting

	// Type mismatch: cannot convert from int to short
	short s = (short) 32769;// Explicit type casting

	// The literal 2147483648 of type int is out of range
	int i = (int) 2147483648L;
	long l = 9223372036854775807L;

	float f = 56.7654566788766676F;// 3.4e^38
	double d = 56.7654566788766676D;// 1.7e^308

	// 32768 + 32767 = 65535
	// 2 bytes and the range is 0 to 65535
	char c = 'A';
	char c1 = '@';
	char c2 = '1';

	char c3 = 65535;// ASCII code --> 65=A, 66=B... 90=Z
	char c4 = '\u0021';// unicode

	boolean boo = true;
//	boolean boo1 = "true";//cannot convert from String to boolean
//	boolean boo2 = "false";//cannot convert from String to boolean
//	boolean boo3 = TRUE;//TRUE cannot be resolved to a variable
//	boolean boo4 = FALSE;
//	boolean boo5 = True;
//	boolean boo6 = False;
//	boolean boo7 = 0;//Type mismatch: cannot convert from int to boolean
//	boolean boo8 = 1;//Type mismatch: cannot convert from int to boolean

	public static void main(String[] args) {
		System.out.println("main method started ");
		// Whenever we create an Object then all instance data
//		will be loading into Heap memory.
		TestDataTypesDemo1 s1 = new TestDataTypesDemo1();

		// Accessing the instance data
		System.out.println("byte value : " + s1.b);// 0
		System.out.println("short value : " + s1.s);// 0
		System.out.println("int value : " + s1.i);// 0
		System.out.println("long value : " + s1.l);// 0

		System.out.println("float value : " + s1.f);// 0.0
		System.out.println("double value : " + s1.d);// 0.0

		System.out.println("char value :" + s1.c); //
		System.out.println("char value :" + s1.c1); //
		System.out.println("char value :" + s1.c2); //
		System.out.println("char value :" + s1.c3); //
		System.out.println("char value :" + s1.c4); //
		System.out.println("boolean value : " + s1.boo);// false

		if (s1.boo) {
			System.out.println("Hello");
		}

	}

}
