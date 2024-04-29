package test2;
public class Employee implements Comparable<Employee>{
	
	String firstName;
	String lastName;
	
	public Employee(String firstn, String lastn) {
		// TODO Auto-generated method stub
		this.firstName = firstn;
		this.lastName = lastn;
	}
	
	public String toString() {
		return "(" + lastName + "," +firstName + ")";
	}
	
	//Implement the comparable interface must override comapreTo()
	
	@Override public int compareTo(Employee value) {
		if (this.lastName.compareTo(value.lastName) != 0) {
			//if lastNames are different, compare lastName
			return this.lastName.compareTo(value.lastName);
		}else {
			//if lastNames are the same, compare firstName
			return this.firstName.compareTo(value.firstName);
		}
	}

}
