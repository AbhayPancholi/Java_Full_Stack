class FirstThread extends Thread {
    public void run() {
        try {
            for (int i = 20; i > 10; i--) {
                System.out.println(i);
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
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted 2nd thread" + e);
        }
    }
}

class UseFirstandSecond{
    public static void main(String[] ar) {
        FirstThread t1 = new FirstThread();
        t1.start();
        SecondThread t2 = new SecondThread();
        t2.start();
    }
}
