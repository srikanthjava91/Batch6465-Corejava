package com.java8features.stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//WAP to convert Date format from old to new style ..?
public class TestDateDemo1 {

	static final String OLD_FORMAT = "dd/MM/yyyy";
	static final String NEW_FORMAT = "yyyy-MM-dd";

	public static void main(String[] args) throws ParseException {
		long millis = System.currentTimeMillis();
		System.out.println(millis);// 1734662586868
		Date date = new Date(1734662586868L);
		Date date1 = new Date();
		System.out.println(date);
		System.out.println(date1);

		String s = "123";
		int s1 = Integer.parseInt(s);
		System.out.println(s + 10);// 12310
		System.out.println(s1 + 10);// 133

		String oldDateString = "12/08/2024";
		String newDateString;

		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
//		// String to Date
		Date d = sdf.parse(oldDateString);// text to Date - parse
		System.out.println(d);

		sdf.applyPattern(NEW_FORMAT);
		newDateString = sdf.format(d);// Date to text - format
		System.out.println("old Date : " + oldDateString);
		System.out.println("new Date : " + newDateString);

	}

}
