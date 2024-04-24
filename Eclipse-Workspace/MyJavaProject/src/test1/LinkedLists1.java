package test1;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class LinkedLists1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1 = new LinkedList<>();
		
		List<String> places = new LinkedList<>();
		
		l1.add("java");
		l1.add("python");
		l1.add("node");
		
		System.out.println(l1);
		
		List<String> beaches = Arrays.asList("marina", "santhone", "besnt nagar", "kolvam", "vgp");
		System.out.println(beaches);
	}

}
