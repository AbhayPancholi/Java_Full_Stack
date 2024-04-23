//package test;
//import java.util.Vector;
//
//public class Testvector1 {
//
//    public static void main(String[] args) {
//        // Create a new Vector object named v1
//        Vector<String> v1 = new Vector<String>();
//        
//        // Adding elements to the vector
//        v1.add("Element 1");
//        v1.add("Element 2");
//        v1.add("Element 3");
//        
//        // Accessing elements from the vector
//        System.out.println("First element: " + v1.get(0));
//        System.out.println("Second element: " + v1.get(1));
//        System.out.println("Third element: " + v1.get(2));
//        
//        // Removing an element from the vector
//        v1.remove(1); // Removes the second element
//        
//        // Displaying the contents of the vector after removal
//        System.out.println("After removing the second element: " + v1);
//    }
//}



package test1;
import java.util.Vector;

public class Testvector1 {

    public static void main(String[] args) {
        // Create a new Vector object named v1 without specifying a type parameter
        Vector v1 = new Vector();
        
        // Adding elements to the vector
        v1.add(10); // Adding an integer
        v1.add("Element"); // Adding a string
        v1.add(3.14); // Adding a double
        
        // Accessing elements from the vector
        System.out.println("First element: " + v1.get(0));
        System.out.println("Second element: " + v1.get(1));
        System.out.println("Third element: " + v1.get(2));
        
        boolean y = v1.contains(10);
        
        System.out.println(v1.capacity());
        
        v1.add(new StringBuffer("Hi all"));
        
        // Removing an element from the vector
        v1.remove(1); // Removes the second element
        
        // Displaying the contents of the vector after removal
        System.out.println("After removing the second element: " + v1);
    }
}
