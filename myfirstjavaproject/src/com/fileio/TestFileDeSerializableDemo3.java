package com.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestFileDeSerializableDemo3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\Users\\srknt\\Srikanth Java\\test\\empa.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp1 = (Employee) ois.readObject();
		
		System.out.println(emp1.username);
		System.out.println(emp1.password);

	}

}
