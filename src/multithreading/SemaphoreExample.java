package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {

        Semaphore callBox = new Semaphore(2);

        Person john = new Person("John", callBox);
        Person Helen = new Person("Helen", callBox);
        Person Paul = new Person("Paul", callBox);
        Person Jessy = new Person("Jessy", callBox);
        Person Edward = new Person("Edward", callBox);
    }

}

class Person extends Thread {

    private String name;
    private Semaphore callBox;

    public Person (String name, Semaphore callBox) {
       this.name = name;
       this.callBox = callBox;
       this.start();
    }

    public void run() {
        try {
            System.out.println(name + " waiting");
            callBox.acquire();
            System.out.println(name + " calling");
            Thread.sleep(2000);
            System.out.println(name + " leave callBox");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }

}
