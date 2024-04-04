// Static block is the first to execute
class Test1{
static{
System.out.println("Static block 1 says I am first");
}

static{
System.out.println("Static block 2 says I am first");
}

static void add(int a, int b){
System.out.println(a+b);}

public static void main(String[] ar){
System.out.println("main() says I am first");
add(2,3);
Test1.add(2,3);
}

static{
System.out.println("Static block 3 says I am first");
}

}

//TTest1.main() - add()  -add()-main()