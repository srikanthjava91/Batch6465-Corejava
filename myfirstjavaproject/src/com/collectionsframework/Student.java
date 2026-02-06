package com.collectionsframework;

public class Student {

	int sno;
	String sname;
	int age;
	long phone;
	double marksP;

	@Override
	public String toString() {
		return "Student [sno=" + sno + 
				", sname=" + sname + 
				", age=" + age + 
				", phone=" + phone + 
				", marksP=" + marksP
				+ "]";
	}

	public Student(int sno, String sname, int age, long phone, double marksP) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.age = age;
		this.phone = phone;
		this.marksP = marksP;
	}

}
