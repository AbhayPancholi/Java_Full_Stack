package io_in_java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyfile1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("D:\\Study\\Java Full Stack\\Eclipse-Workspace\\MyJavaProject\\javacreatefilesample1.txt");
			out = new FileOutputStream("Output121.txt");
			
			int c;
			
			while ((c=in.read()) != -1) {
				out.write(c);
			}
		}finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

}
