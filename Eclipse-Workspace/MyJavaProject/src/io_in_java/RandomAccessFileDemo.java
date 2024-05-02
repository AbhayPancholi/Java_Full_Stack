package io_in_java;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile raf=new RandomAccessFile("D:\\Study\\Java Full Stack\\Eclipse-Workspace\\MyJavaProject\\javacreatefilesample1.txt", "rw");
			
			//raf.writeUTF("Hello World");
			
			raf.seek(0);
			System.out.println(" "+raf.readLine());
			
			raf.seek(10);
			raf.writeUTF("This is an example \n Hello Workd");
			
			raf.seek(10);
			System.out.println(" "+raf.readLine());
			
			raf.close();
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
