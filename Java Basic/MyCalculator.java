//instance method or non static method

class MyCalculator{
void add(int a, int b){
System.out.println(a+b);
}

int sub(int a, int b){
return a-b;
}

public static void main(String[] ar){
MyCalculator m1=new MyCalculator();
m1.add(2, 3);
int res = m1.sub(12,3);
System.out.println(res);
}
}