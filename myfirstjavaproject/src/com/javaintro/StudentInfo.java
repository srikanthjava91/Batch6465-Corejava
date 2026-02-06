package com.javaintro;

public class StudentInfo {
	int sid;
	String sname;

	static int instId = 555;
	static String instName = "Vcube";

	// static block
	static {
		System.out.println("static block called ");
	}

	// static method
	 static void welcome() {
			System.out.println("welcome : " + Thread.currentThread().getName());
		System.out.println("Welcome to Vcube !");
		System.out.println("Welcome to Vcube !");
		System.out.println("Welcome to Vcube !");
	}
	
	//instance method
	void hello(){
		System.out.println("hello : " + Thread.currentThread().getName());
		System.out.println("Hello Vcube Students !!");
		System.out.println("Hello Vcube Students !!");
		System.out.println("Hello Vcube Students !!");
	}

	// main method
	public static void main(String[] args) {
		System.out.println("main method strated ");
		System.out.println("main : " + Thread.currentThread().getName());
		System.out.println("Vcube Student Info ");
		
		StudentInfo s1 = new StudentInfo();
		welcome();
		s1.hello();
		System.out.println(instId);
		System.out.println(instName);
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		
		System.out.println("main method ended ");
	}

}
