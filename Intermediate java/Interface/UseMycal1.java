//Functional interfrace must have only one abstract method


interface Mycal1{

public abstract void add(int a, int b);
}


class UseMycal1{

public static void main(String[] ar){
<<<<<<< Updated upstream
Mycal1 m1 = (int a, int b) -> System.out.println();
=======
Mycal1 m1 = (int a, int b) -> System.out.println(a+b);
>>>>>>> Stashed changes
m1.add(12, 23);}
}