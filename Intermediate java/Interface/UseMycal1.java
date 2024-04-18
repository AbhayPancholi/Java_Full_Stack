//Functional interfrace must have only one abstract method


interface Mycal1{

public abstract void add(int a, int b);
}


class UseMycal1{

public static void main(String[] ar){
Mycal1 m1 = (int a, int b) -> System.out.println();
m1.add(12, 23);}
}