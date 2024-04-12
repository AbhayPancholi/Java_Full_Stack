class Test1{
public static void main(String[] ar){
System.out.println("the main from test 1 is called");
//Test2 t1 = new Test2();
//t1.main(ar);
Test2.main(ar);
}
}

class Test2{
public static void main(String[] ar){
System.out.println("the main from test 2 is called");
}
}