package test2;

public class MethodRefrence2 {
	
	public static void ThreadStatus1() {
		System.out.println("thread 1 is running");
	}
	
	public static void ThreadStatus2() {
		System.out.println("thread 2 is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(MethodRefrence2::ThreadStatus2);
		t1.start();
	}

}
