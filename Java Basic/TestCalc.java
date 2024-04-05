//Overloading
/*Writing more than one mehtod with same name but different arguments is overloading Copiler decides which is to be invoked based on the arguments passed, its compiler time polymorphism
Early binding - as themethod call is done early at compile time*/


class TestCalc{
void add(int a){
a++;
System.out.println(a);
}

void add(int a, int b){
System.out.println(a+b);
}

public static void main(String[] aa){
TestCalc t1 = new TestCalc();
t1.add(5);
t1.add(10,20);
}
}