package multithreading;

import org.w3c.dom.ls.LSOutput;

public class DeadLockExample {

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {

        Thread100 thread100 = new Thread100();
        Thread200 thread200 = new Thread200();

        thread100.start();
        thread200.start();
    }
}


class Thread100 extends Thread {
    public void run() {
        System.out.println(this.getName() + " Try to take monitor of lock1");
        synchronized (DeadLockExample.lock1) {
            System.out.println(this.getName() + " lock1 monitor taken");
            System.out.println(this.getName() + " Try to take monitor of lock2");
            synchronized (DeadLockExample.lock2) {
                System.out.println(this.getName() + " lok2 monitor taken");

            }
        }

    }
}
class Thread200 extends Thread {
    public void run() {
        System.out.println(this.getName() + " Try to take monitor of lock2");
        synchronized (DeadLockExample.lock2) {
            System.out.println(this.getName() + " lock2 monitor taken");
            System.out.println(this.getName() +" Try to take monitor of lock1");
            synchronized (DeadLockExample.lock1) {
                System.out.println(this.getName() +" lok1 monitor taken");

            }
        }

    }
}
