//This class calls Developer.java file

package test2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class TestSorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Developer> result = new ArrayList<Developer>();
		
		result.add(new Developer("Abhay", 2000000, 21));
		result.add(new Developer("Kumar", 25614, 25));
		result.add(new Developer("Rahul", 2255678, 26));
		result.add(new Developer("Akshay", 24643, 57));
		
		System.out.println("Before sort");
		
		for (Developer developer : result) {
			System.out.println(developer);
		}
		
		//sort by age or salary -strategic design pattern
		Collections.sort(result, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		
		System.out.println("After sort");
		for (Developer developer : result) {
			System.out.println(developer);
		}
		
	}

}
