// Static block is the first to execute
class Test1{
static{
System.out.println("Static block 1 says I am first");
}

static{
System.out.println("Static block 2 says I am first");
}

static int add(int a, int b){
//System.out.println(a+b);
return a+b}

public static void main(String[] ar){
System.out.println("main() says I am first");
int sum = add(2,3);
int sum1 = Test1.add(2,3);
System.out.println(sum);
System.out.println(sum1);
}

static{
System.out.println("Static block 3 says I am first");
}

}

//TTest1.main() - add()  -add()-main()