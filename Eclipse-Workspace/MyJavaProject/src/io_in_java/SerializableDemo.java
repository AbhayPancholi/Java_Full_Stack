package io_in_java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.name = "shahu college of engg";
		e.address = "kanchanwadi, Aurangabad";
		e.SSN = 1112223334;
		e.number = 102;
		
		try {
			FileOutputStream fileout = new FileOutputStream("employee2.ser");
			
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			
			out.writeObject(e);
			
			out.close();
			fileout.close();
			System.out.println("Serializied data is saved in employee.ser");
		}catch(IOException i) {
			i.printStackTrace();
		}

	}

}
