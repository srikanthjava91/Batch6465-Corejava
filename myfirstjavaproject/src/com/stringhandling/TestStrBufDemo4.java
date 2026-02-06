package com.stringhandling;

public class TestStrBufDemo4 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());// 16

		StringBuffer sb2 = new StringBuffer("Java");
		System.out.println(sb2.capacity());// 20

		StringBuffer sb3 = new StringBuffer();
		sb3.append("JavaJavaJavaJava");
		System.out.println(sb3.capacity());//16
		
		StringBuffer sb4 = new StringBuffer();
		sb4.append("JavaJavaJavaJavaJavaJavaJavaJavaJaJa");
		System.out.println(sb4.capacity());//34 --> 36
		
		StringBuffer sb5 = new StringBuffer();
		sb5.append("JavaJavaJavaJavaJavaJavaJavaJavaJaJa");
		sb5.append("Java");
		System.out.println(sb5.capacity());//34 --> 36

	}

}
