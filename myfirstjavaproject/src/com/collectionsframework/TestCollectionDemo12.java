package com.collectionsframework;

import java.util.Enumeration;
import java.util.Vector;

public class TestCollectionDemo12 {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();
		v.addElement(10);
		v.addElement(18);
		v.addElement(15);
		v.addElement(12);
		v.addElement(19);
		v.addElement(20);
		v.addElement(10);
		v.addElement(18);
		v.addElement(15);
		v.addElement(12);
		v.addElement(19);
		v.addElement(20);
		
		Enumeration<Integer> en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
