package io_in_java;
import java.io.*;
public class Testio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println(num1/num2);
		}catch(Exception e) {
			System.out.println("Please provide two numbers, the second number must be a non-zero"+e);
			try {
				FileOutputStream fos = new FileOutputStream("mylog.txt", true);
				String ex=e.toString();
				byte[] b= ex.getBytes();
				fos.write(b);
			}catch(IOException e1) {
				System.out.println("Error creating file or writing file: "+e);
			}
		}
	}

}
