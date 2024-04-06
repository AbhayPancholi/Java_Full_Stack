/*Class Inheritance*/

class Mother{

private void job(){
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

void myjob(){
System.out.println("Working in software sector");
}

public void property(){
System.out.println("Owns a mercedes");
}

public static void main(String[] ar){

Mother m1 = new Mother();
//m1.job();
m1.property();
m1.hobby();

Daughter d1 = new Daughter();
d1.myjob();
d1.property();
d1.hobby();


}
}