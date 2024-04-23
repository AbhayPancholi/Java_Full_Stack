package test1;


import java.util.Hashtable;

public class Hashtable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> h1 = new Hashtable<>();
		
		System.out.println();
		
		h1.put("Vidyut Jamwal", 1);
		h1.put("",2);
		h1.put("Robert Green", 3);
		
		System.out.println(h1);
		
		System.out.println(h1.get(""));
	}

}
//Hashtables do not preserve the order