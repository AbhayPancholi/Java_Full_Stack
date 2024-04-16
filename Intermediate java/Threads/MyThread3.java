class MyThread3 extends Thread{

public void run(){
try{
for(int i=0;i<10;i++){
System.out.println(Thread.currentThread().getName());
Thread.sleep(5000);}
}catch(InterruptedException e){
System.out.println("thread while sleeping got interrupted: "+e);
}}

public static void main(String[] ar){
MyThread2 t1 = new MyThread2();//birth
t1.start();//ready to run

MyThread2 t2 = new MyThread2();//birth
t2.start();//ready to run
}
}