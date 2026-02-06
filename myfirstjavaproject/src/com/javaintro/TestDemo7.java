package com.javaintro;

public class TestDemo7 {
	
	//Native methods do not specify a body
//	native void hello() {
//		
//	}
	
	native void hello();

	public static void main(String[] args) {
		System.out.println("main method started with String args in TestDemo7");
		System.out.println(100);
		System.out.println('A');
		System.out.println(5.9);
		
		main();
		main();
		main();
		main();
		main();
		main();
		main();
		main();
		main();
		main();
		

	}
	
	static void main() {
		System.out.println("main method with no arg");
	}
	
	
}
