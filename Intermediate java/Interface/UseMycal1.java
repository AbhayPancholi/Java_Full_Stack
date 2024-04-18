//Functional interfrace must have only one abstract method


interface Mycal1{

public abstract void add(int a, int b);
}


class UseMycal1 implements Mycal1{

public void add(int a, int b){
System.out.println(a+b);
}

public static void main(String[] ar){
Mycal1 m1 = new UseMycal1();
m1.add(12, 23);}
}