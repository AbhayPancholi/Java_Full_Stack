public class ThreadGroup1{
public static void main(String[] ar){
Thread t1 = Thread.currentThread();
ThreadGroup tg1 = t1.getThreadGroup();

System.out.println("Current Thread's name: "+t1.getName());
System.out.println("Current thread group name: "+tg1.getName());

Thread t2 = Thread.currentThread();
ThreadGroup tg2 = t2.getThreadGroup();

System.out.println("Current Thread's name: "+t2.getName());
System.out.println("Current thread group name: "+tg2.getName());
}
}