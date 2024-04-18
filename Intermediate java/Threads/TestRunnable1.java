// This is the earlier method used to implement runnable 

class TestRunnable1 implements Runnable{

public void run(){

System.out.println(Thread.currentThread().getName());

}

public static void main(String[] ar){

TestRunnable t = new TestRunnable();
Thread t1 = new Thread(t);
t1.start();

Thread t2 = new Thread(t);
t2.start();
}

}