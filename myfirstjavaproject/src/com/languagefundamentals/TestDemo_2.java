package com.languagefundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

class Dog {
	String name = "puppy";
	String breed = "Lab";

}

public class TestDemo_2 {

	String str = "Srikanth";// String Literals
	String str1 = new String("Java");//String with new keyword or String Object
	
	
	BigInteger bi1 = new BigInteger("87665435678976543456");
	BigInteger bi2 = new BigInteger("8766543567897654345687665435678976543456");

	BigDecimal bd1 = new BigDecimal("300");
	BigDecimal bd2 = new BigDecimal("500");
	
	Dog dog = new Dog();

	// Converting Primitive Data to Wrapper Object data types is called Auto-Boxing.
	// Converting Wrapper Object data to primitive data types is called
	// Auto-Unboxing
	Byte b = 10;
	byte b2 = b;

	Short s = 100;

	Integer i = 256;
	Long l = 786565780987L;

	Character c = 'A';
	Boolean b1 = false;

	Float f = 5.6F;
	Double d = 7.5D;

	public static void main(String[] args) {
		TestDemo_2 t = new TestDemo_2();

		System.out.println("Pre-defined Wrapper Object Data Types ");
		System.out.println("Byte value : " + t.b);
		System.out.println("Byte value : " + t.b2);

		System.out.println("Short value : " + t.s);
		System.out.println("Integer value : " + t.i);
		System.out.println("Long value : " + t.l);

		System.out.println("Character value :" + t.c);
		System.out.println("Bollean value  :" + t.b1);

		System.out.println("Float Value : " + t.f);
		System.out.println("Double value : " + t.d);

		System.out.println("*******Predefined & Userdefined data types *********");
		System.out.println(t.str);
		System.out.println(t.str1);
//		System.out.println(t.dog);

		System.out.println("******BigInteger & BigDecimal data*************");
		System.out.println(t.bi1);
		System.out.println(t.bi2);

		// The operator + is undefined for the argument type(s) java.math.BigInteger,
		// java.math.BigInteger
//		System.out.println(t.bi1 + t.bi2);//CE
		
		System.out.println(t.bi1.add(t.bi2));//300
		System.out.println(t.bi1.multiply(t.bi2));

		System.out.println(t.bd1);
		System.out.println(t.bd2);

		System.out.println("Dog info **************");
		System.out.println(t.dog.name);// Address of the Dog class
		System.out.println(t.dog.breed);

	}
}
