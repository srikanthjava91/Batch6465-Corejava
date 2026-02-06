package com.oops;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		
//		Modify the data 
//		e1.salary= 700000.00;
		e1.setEid(18);
		e1.setEname("Kohli");
		e1.setSalary(100000.00);
		e1.setPhone(8888888888L);

		
		//Reading the data 
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		System.out.println(e1.getSalary());
		System.out.println(e1.getPhone());

//		e1.eid = 10;
		// private data, we cannot access outside of the classes
		// Direct access --> We should stop this
//		System.out.println(e1.eid);
//		System.out.println(e1.ename);
//		System.out.println(e1.phone);
//		System.out.println(e1.salary);

	}

}
