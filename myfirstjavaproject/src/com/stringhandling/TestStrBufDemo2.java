package com.stringhandling;

public class TestStrBufDemo2 {

	public static void main(String[] args) {

		String s1 = new String("Srikant");
		s1.concat("Java");
		System.out.println(s1);

		StringBuffer sb = new StringBuffer("Srikanth");
		sb.append("Java");
		sb.append("isSImple");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("Srikanth");
		sb1.append("Java");
		sb1.append("isSImple");
		System.out.println(sb1);
	}

}
