class TestRunnable1{

public static void main(String[] ar){

TestRunnable t = () -> System.out.println(Thread.currentThread().getName());
Thread t1 = new Thread(t);
t1.start();

Thread t2 = new Thread(t);
t2.start();
}

}