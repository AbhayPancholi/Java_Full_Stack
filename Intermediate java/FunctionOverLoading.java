/* Fucnction overloading */

class FunctionOverLoading{

void add(int a){
a++;
System.out.println(a);
}

void add(int a, int b){
System.out.println(a+b);
}

public static void main(String[] ar){
FunctionOverLoading l1 = new FunctionOverLoading();

l1.add(2);
l1.add(2,3);
}

}