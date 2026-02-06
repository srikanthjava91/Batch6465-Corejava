package com.collectionsframework;

public class Employee implements Comparable<Employee> {

	int eid;
	String ename;
	double esal;
	int eage;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eage=" + eage + "]";
	}

	public Employee(int eid, String ename, double esal, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.eage = eage;
	}

	@Override
	public int compareTo(Employee o) {

		if (this.eage < o.eage) {
			return -1;
		} else if (this.eage > o.eage) {
			return 1;
		} else {
			return 0;
		}
//		return this.ename.compareTo(o.ename);
	}
}
