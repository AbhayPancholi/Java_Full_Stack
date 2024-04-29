package test2;

import java.util.Arrays;
//SortExample.java using Comparable -driver code

public class SortExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a[] = new Employee[4];
		
		a[0] = new Employee("Abhay", "Pancholi");
		a[1] = new Employee("Rahul", "Ghayawat");
		a[2] = new Employee("Sheshraj", "Pawar");
		a[3] = new Employee("Lucky", "Ghayawat");
		
//		for (int i=0; i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		//The .sort() method uses the Comparable interface
		Arrays.sort(a);
		
		//Print out this sorted Employees
		
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
