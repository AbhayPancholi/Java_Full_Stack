package streams1;

public class Movie {

	private String Name;
	private int year;
	private String hero;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	
	public Movie(String name, int year, String hero) {
		super();
		Name = name;
		this.year = year;
		this.hero = hero;
		}

}
