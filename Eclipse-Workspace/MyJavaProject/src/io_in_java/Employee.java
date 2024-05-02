package io_in_java;

public class Employee implements java.io.Serializable{
		// TODO Auto-generated method stub
		public String name;
		public String address;
		public transient int SSN;
		public int number;
		
/*Serializable is a marker interface - has no methods to override by implementing classes - like cloneable and remote (jdk 11)*/
}
