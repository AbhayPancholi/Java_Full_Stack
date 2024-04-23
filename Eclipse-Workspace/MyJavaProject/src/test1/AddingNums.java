package test1;

import java.util.Vector;
import java.util.Enumeration;

public class AddingNums {

	public static void main(String[] args) {
		int sum = 0;
		Vector<Integer> v1 = new Vector<>();
		
		v1.add(5);
		v1.add(10);
		v1.add(50);
		
		Enumeration<Integer> nums=v1.elements();
		
		while(nums.hasMoreElements()) {
			sum = sum + nums.nextElement();
			
		}
		System.out.println("the sum of elements is: "+sum);
	}	

}
