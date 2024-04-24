package test1;
import java.util.Arrays;
import java.util.ArrayList;

//Array list is the implementation of global array
//Array list is good for reading as it has indexing, it will accept order and duplicates
//finalize and clone are the two protected methods
public class ArraysvsArraysList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Normal arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		//Accessing array elements
		System.out.println("the first element of array is: "+arr[0]);
		System.out.println("The second element of array is: "+arr[1]);
		System.out.println(Arrays.toString(arr));
		
		
		//Array list 
		//Creating an arraylist with initial capacity 5
		ArrayList<Integer> arrayList = new ArrayList<Integer>(5);
		//Adding elements to arrya list
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		
		System.out.println("the first element of the array list is: "+arrayList.get(0));
		System.out.println("The second element of the arraylist is: "+arrayList.get(0));
		
		
	}

}
