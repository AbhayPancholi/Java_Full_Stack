//package test;
//
//import java.util.Vector;
//import java.util.Enumeration;
//
//class Returnname{
//
//public static void main(String[] args) {
//	
//	Vector<String> names=new Vector<>();
//	
//	names.add("Vaibhav");
//	names.add("hanuman");
//	names.add("Abhay");
//	
//	System.out.println(names);
//	
//	Enumeration<String> e = names.elements();
//	
//	while(e.hasMoreElements()) {
//		System.out.println(e.nextElement());
//	}
//	
//}
//}


package test1;

import java.util.Vector;
import java.util.Scanner;

public class Returnname {

    public static void main(String[] args) {
        Vector<String> names = new Vector<>();
        names.add("Vaibhav");
        names.add("hanuman");
        names.add("Abhay");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        if (names.contains(userName)) {
            System.out.println("Welcome, " + userName + "!");
        } else {
            System.out.println("Name not found. Please try again.");
        }

        scanner.close();
    }
}


//Same code just using input bufferReader

//package test;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Vector;
//
//public class Returnname {
//
//    public static void main(String[] args) {
//        Vector<String> names = new Vector<>();
//        names.add("Vaibhav");
//        names.add("hanuman");
//        names.add("Abhay");
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//            System.out.print("Enter your name: ");
//            String userName = reader.readLine();
//
//            if (names.contains(userName)) {
//                System.out.println("Welcome, " + userName + "!");
//            } else {
//                System.out.println("Name not found. Please try again.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred while reading input: " + e.getMessage());
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                System.out.println("An error occurred while closing the reader: " + e.getMessage());
//            }
//        }
//    }
//}
//
