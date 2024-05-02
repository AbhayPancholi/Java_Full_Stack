package io_in_java;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("javacreatefilesample1.txt");
			
			if (file.createNewFile()) {
				System.out.println("New file is created by java!");
				
			}else {
				System.out.println("File already exists");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
