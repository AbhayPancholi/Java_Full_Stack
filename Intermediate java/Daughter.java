/*Class Inheritance*/

class Mother{

void job(){
System.out.println("has own startup");
}

void hobby(){
System.out.println("Reading, Coding, Writing");
}

void property(){
System.out.println("flat in sambhajinagar");
}

}

class Daughter extends Mother{

public static void main(String[] ar){

Mother m1 = new Mother();
m1.job();
m1.property();
m1.hobby();

Daughter d1 = new Daughter();
d1.job();
d1.property();
d1.hobby();


}
}