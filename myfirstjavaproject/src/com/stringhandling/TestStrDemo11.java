package com.stringhandling;

public class TestStrDemo11 {

	public static void main(String[] args) {
		System.out.println("main methdo started !!");
		String[] names = { "Abhishek", "Tilak", "Surya", "Hardhik", "Gill", "Varun", "Jaiswal", "Sanju Samson",
				"Kuldeep", "Anudeep", "Sreekanth", "Preetham" };

		for (String name : names) {
			if (name.toLowerCase().contains("e") && name.toLowerCase().contains("h")) {
				System.out.println(name);
			}
		}
		
		System.out.println("************************");
		for(String name:names) {
			if((name.startsWith("A") || name.startsWith("S")) && (name.endsWith("h") || name.endsWith("k")) ) {
				System.out.println(name);
			}
		}
	}

}
