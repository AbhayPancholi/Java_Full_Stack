package test1;

import java.util.Enumeration;
import java.util.Vector;

public class Testvector0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Vector v1=new Vector();
	System.out.println(v1);
	System.out.println(v1.capacity());
	v1.add(new String("hello"));
	System.out.println(v1);
	boolean y=v1.contains("hello");
	System.out.println(y);
	v1.add(new StringBuffer("hi all"));
	System.out.println(v1);
	System.out.println(y);
	Vector <String> techs=new Vector<>();
	techs.add("java FS");
	techs.add("AI");
	techs.add("DS");
	techs.add("angular react");
	techs.add("python");
	techs.add("node");
	System.out.println(techs);
	Enumeration e=techs.elements();
	//has MoreElements() next Element
	while(e.hasMoreElements()) {
		
		System.out.println(e.nextElement());
	}
	}

	
}
