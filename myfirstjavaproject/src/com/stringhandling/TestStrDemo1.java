package com.stringhandling;

//How to Create String Objects in Java ..? 
//There are 4 ways to create Strings in Java.
public class TestStrDemo1 {

	public static void main(String[] args) {

		// String literals are storing into SCP.
		String str = "Srikanth";// it creates only one object

//		it will not create new object, 
//		it's pointing to the old object with the same reference.
		String str1 = "Srikanth";

		System.out.println(str == str1);

		// it creates two objects one is in Heap with reference + another one is in scp
		// without reference.
		String str2 = new String("Java");// 2

		// it creates only one in Heap memory, because already we have the below object
		// in SCP.
		String str3 = new String("Java");// 1
		System.out.println(str2 == str3);

	}

}
