//non static mehtod we need an instance to access it
class Student{
void display(){
System.out.println("Hello");}

public static void main(String[] ar){
Student s1 = new Student();
Student s2 = new Student();
s1.display();
s2.display();
System.out.println(s1);
System.out.println(s2);}

}

//Attributes are values and methods are behaviour those attributes are //going to change as per behaviour