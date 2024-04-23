package test1;


import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> h1 = new Hashtable<>();
		
		System.out.println();
		
		h1.put("Akola", 1);
		h1.put("Amravati", 2);
		h1.put("SambhajiNagar",3);
		
		System.out.println(h1);
		
		System.out.println(h1.get("Akola"));
	}

}
//Hashtables do not preserve the order