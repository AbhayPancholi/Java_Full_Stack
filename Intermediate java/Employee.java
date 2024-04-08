class Employee{//This class extends java.lang.object class

int empid;
String empname;
int salary;
static int counter;

Employee(){
System.out.println("No values object created wiht default values");
counter++;
System.out.println("counter"+counter);
}

Employee(int id, String name, int sal){

System.out.println("Three ag - Object created with values passed");

this.empid=id;
this.empname = name;
this.salary = sal;

counter++;
System.out.println("counter"+counter);

}

public static void main(String[] ar){

Employee e1=new Employee();
System.out.println(e1.empid);
System.out.println(e1.empname);
System.out.println(e1.salary);

Employee e2=new Employee();
System.out.println(e2.empid);
System.out.println(e2.empname);
System.out.println(e2.salary);

System.out.println(e1 instanceof Employee);
System.out.println(e2 instanceof Employee);
System.out.println(e1 instanceof Object);
System.out.println(e2 instanceof Object);


}

}