package streams1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class One {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> mymoviesList = Arrays.asList(new Movie("kala patthar", 1992, "Amitabh Bacchan"), new Movie("Darbar", 2020, "Rajnikant"));
		
		Stream<Movie> mymoviesStream = mymoviesList.stream();
		
		Stream<Movie> mymoviesFilter = mymoviesStream.filter(m->m.getYear() == 2020);
		
		Stream<String> mymoviesmap = mymoviesFilter.map(m->m.getName());
		
		mymoviesmap.forEach(System.out::println);
	}

}
