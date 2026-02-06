package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {

	private static final long serialVersionUID = -5020287027722771480L;
	String username = "SrikanthJava";
	transient String password = "Java@Simple";

}

public class TestFileSerializableDemo2 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method staretd !");

		// Serialization
		Employee emp1 = new Employee();
		FileOutputStream fos = new FileOutputStream("C:\\Users\\srknt\\Srikanth Java\\test\\empa.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);

	}
}
