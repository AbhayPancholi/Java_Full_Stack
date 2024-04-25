package test2;

import java.util.LinkedList;
import java.util.Queue;

public class Queuejdk8way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		
//		1.use stream and lambda method
		queue.stream().forEach(S -> {
			System.out.println(S);
		});
		
		//Shorthand of the above code
		queue.stream().forEach(S -> System.out.println(S));
	}

}
