/*using runnable unterface is always a better optionn as we know a class can implement any number of interfaces but can extend only one class at a time*/

class TestRunnable implements Runnable{
public void run(){
System.out.println("Run method called by thread: "+Thread.currentThread().getName());
}

public static void main(String[] ar){
TestRunnable r1 = new TestRunnable();
Thread t1 = new Thread(r1);
t1.setName("One");
t1.start();
Thread t2 = new Thread(r1);
t2.setName("two");
t2.start();
}
}