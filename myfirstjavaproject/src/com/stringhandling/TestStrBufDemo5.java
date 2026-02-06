package com.stringhandling;

public class TestStrBufDemo5 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Srikanth");
		System.out.println(sb1.delete(0, 2));// ikanth or kanth
		System.out.println(sb1.deleteCharAt(0));
		System.out.println(sb1);//rikanth or kanth 
		
		System.out.println(sb1.reverse());
		
		StringBuffer sb2 = new StringBuffer();
		sb2.ensureCapacity(100);
		System.out.println(sb2.capacity());//16

	}

}
