/*class CustomThread implements Runnable {

    private String name;

    public CustomThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    public static void main(String[] args) {
        String py = "python";
        String jv = "java";
        CustomThread c1 = new CustomThread(jv);
        Thread t1 = new Thread(c1);
        t1.start();

	CustomThread c2 = new CustomThread(py);
        Thread t2 = new Thread(c2);
        t2.start();
    }
}*/







class FirstThread extends Thread {
    public void run() {
        try {
	char[] jv = "java".toCharArray();
            for (int i = 0; i<jv.length; i++) {
                System.out.println(jv[i]);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted 1st thread" + e);
        }
    }
}

class SecondThread extends Thread {
    public void run() {
        try {
	char[] py = "python".toCharArray();
            for (int i=0; i<py.length; i++) {
                System.out.println(py[i]);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted 2nd thread" + e);
        }
    }
}

class CustomThread{
    public static void main(String[] ar) {
        FirstThread t1 = new FirstThread();
        t1.start();
	try{
	t1.join();}catch(InterruptedException e){System.out.println("join failed");}
        SecondThread t2 = new SecondThread();
        t2.start();
//The join method lets t1 finish the execution first, and then the //thread t2 will start
    }
}


