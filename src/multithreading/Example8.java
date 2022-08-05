package multithreading;

public class Example8 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread name - "
                    + Thread.currentThread().getName() + " ---- " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable8());
        Example8 thread2 = new Example8();

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("THE END!!!");
    }
}
class MyRunnable8 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread name - "
                    + Thread.currentThread().getName() + " ---- " + i);
        }
    }
}