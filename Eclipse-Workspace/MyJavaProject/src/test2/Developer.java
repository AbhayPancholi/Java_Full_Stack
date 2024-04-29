package test2;

public class Developer {
	
	private String name;
	private int salary;
	private int age;
	public Developer(String name, int salary, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
		this.age = age;
		System.out.println("Developer() called" + this.name + this.salary + this.age);
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Developer called" + "Name is: " + this.name + "Salary is: " + this.salary + "Age is: " + this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getSalary() {
		return this.salary;
	}
}
