package com.languagefundamentals;

//TestTypesOfVariablesDemo1
public class Student {

	// instance + primitive Data
	int id = 10;

	// instance + Object Data
	String name = "Ram";

	// static + Object data
	static String orgName = "Vcube Software Solutions";

	// static + primitive
	static int orgId = 123;

	public static void main(String[] args) {
		System.out.println("main method strated ");

		// local variables
		int orgId = 555;
		String orgName = "Vcube";

		int x;
//		The local variable x may not have been initialized
//		System.out.println(x);

		Student s = new Student();
		System.out.println("insatnce data we must need to access through object reference variable only *******");
		System.out.println(s.id);
		System.out.println(s.name);

		System.out.println("static data we can access directly within the class********");
		System.out.println(orgId);
		System.out.println(orgName);

		System.out.println("static data we can access by using class name also*** ");
		System.out.println(Student.orgId);
		System.out.println(Student.orgName);

		// The static field Student.orgId should be accessed in a static way
		System.out.println(
				"static data we can access by using Object reference variables also ********* but it is not recommended approach");
		System.out.println(s.orgId);
		System.out.println(s.orgName);

	}

}
