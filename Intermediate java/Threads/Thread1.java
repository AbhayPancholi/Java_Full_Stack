class Thread1{

static{
System.out.println("Static block: "+Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
}

public static void main(String[] ar){
System.out.println("Main(): "+Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
}
}