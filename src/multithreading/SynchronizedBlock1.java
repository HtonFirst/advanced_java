package multithreading;

import org.w3c.dom.ls.LSOutput;

public class SynchronizedBlock1 {
    public static void main(String[] args) {

        myRunnableImp12 runnable = new myRunnableImp12();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
class Counter2 {
    public static int counter;
}

class myRunnableImp12 implements Runnable {

    private void doWork2() {
        System.out.println("Ura!!!");
    }

    private void doWork1() {
        doWork2();
        synchronized (this) {
            Counter2.counter++;
            System.out.println(Counter2.counter);
        }
    }

    public void run() {
        for(int i=1; i<=3; i++) {
            doWork1();
        }
    }

}
