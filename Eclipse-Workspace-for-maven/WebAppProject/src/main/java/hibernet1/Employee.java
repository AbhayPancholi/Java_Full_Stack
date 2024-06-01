package hibernet1;

import javax.persistence.*;
@Entity
@Table(name="Employee")

public class Employee {
	
	@Id
	private int id;
	@Override
	public String toString() {
		return "Employee [id = "+id+", name="+name+", salary="+Salary+"]";
	}
	private String name;
	private int Salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
}
