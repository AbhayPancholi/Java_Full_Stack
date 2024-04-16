class MyThread1 extends Thread{

public void run(){
System.out.println(Thread.currentThread().getName());
}

public static void main(String[] ar){
MyThread1 t1 = new MyThread1();//birth
t1.start();//ready to run

MyThread1 t2 = new MyThread1();//birth
t2.start();//ready to run
}
}