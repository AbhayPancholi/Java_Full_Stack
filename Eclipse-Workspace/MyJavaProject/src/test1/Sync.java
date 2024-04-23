package test1;

public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mytable m1 = new Mytable();
		First f1 = new First(m1);
		Second s1 = new Second(m1);
		f1.start();
		s1.start();		
	}

}

class Mytable{
	
	public void printTable(int table) {
		System.out.println("I am going to print a Table of: "+table);
		
		try {
			for(int i=1; i<5;i++) {
				System.out.println(i*table);
				Thread.sleep(2000);
			}
		}catch(InterruptedException e){
			System.out.println("Thread Interrupted"+e);
		}
	}
}

class First extends Thread{
	Mytable mt;
	First(Mytable mt1){
		this.mt=mt1;
	}
	public void run() {
		mt.printTable(5);
	}
	
}

class Second extends Thread{
	Mytable mt;
	Second(Mytable mt1){
		this.mt=mt1;
	}
	public void run() {
		mt.printTable(10);
	}
}