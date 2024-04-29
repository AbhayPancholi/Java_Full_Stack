package test2;

interface calculator{
	void add(int a, int b);
}

public class mycalculator {
	
	public static void addtwo(int a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c=mycalculator::addtwo;
		c.add(12, 23);
	}

}
