package com.stringhandling;

public class TestStrBufDemo3 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.length());// 0
		System.out.println(sb1.capacity());// 16

		StringBuffer sb2 = new StringBuffer("Srikanth");
		System.out.println(sb2.length());// 8
		System.out.println(sb2.capacity());// 24

		StringBuffer sb3 = new StringBuffer();
		sb3.append("SrikanthSrikanthSrikanthSrikanthSri");
		sb3.append("KanthSrikanthSrikanthSrikanthSrikanthSrikanth");
		sb3.append("S");
		System.out.println(sb3.length());// 8
		System.out.println(sb3.capacity());// 16

	}

}
