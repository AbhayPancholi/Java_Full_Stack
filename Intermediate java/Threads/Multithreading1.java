class Maxinarray extends Thread {
    public void run() {
        try {
            System.out.println("Finding maximum from the array");
            int[] arr = {10, 2, 5, 48, 20, 55, 1};
            int max = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println(max);
	    Thread.sleep(10);
        } catch (Exception e) {
            System.out.println("Error in Maxinarray thread: " + e);
        }
    }
}


class Mininarray extends Thread {
    public void run() {
        try {
            System.out.println("Finding minimum from the array");
            int[] arr = {10, 2, 5, 48, 20, 55, 1};
            int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            System.out.println(min);
	    Thread.sleep(10);
        } catch (Exception e) {
            System.out.println("Error in Mininarray thread: " + e);
        }
    }
}

class Descending extends Thread {
    public void run() {
        try {
            System.out.println("Printing descending numbers");
            for (int i = 20; i >= 10; i--) {
                System.out.println(i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted 2nd thread" + e);
        }
    }
}

class Ascending extends Thread {
    public void run() {
        try {
            System.out.println("Printing ascending numbers");
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted 1st thread" + e);
        }
    }
}

class Multithreading1 {
    public static void main(String[] ar) {
        Ascending t1 = new Ascending();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("join failed for thread 1");
        }
        Descending t2 = new Descending();
        t2.start();
	try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("join failed for thread 2");
        }


        Mininarray t3 = new Mininarray();
        t3.start();
	try {
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("join failed for thread 3");
        }
	
	Maxinarray t4 = new Maxinarray();
        t4.start();
	try {
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("join failed for thread 4");
        }


    }
}
