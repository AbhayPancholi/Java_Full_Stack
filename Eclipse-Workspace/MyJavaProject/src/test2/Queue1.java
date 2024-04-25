package test2;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		
		//Concurrent Modification exception
		try {
			//its trying to read the item s form here
			Iterator<Integer> itr = queue.iterator();
			//and concurrently we are adding another element, that causes this exception
			queue.add(50);
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}catch(ConcurrentModificationException ex) {
			System.out.println(ex);
		}
		
		//Using for loop to print elements
//		for (Integer item:queue) {
//			System.out.println(item);
//		}
//		
//		Iterator<Integer> itr=queue.iterator();
//		
//		//hasNext() returns true if the queue has more elements
//		while(itr.hasNext())
//		{
//			//next() returns the next element in the iteration
//			System.out.println(itr.next());
//			
//		}
	}

}
