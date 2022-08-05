package multithreading;

public class Example9 {
    public static void main(String[] args) {

        System.out.println("Method main started");

        Thread thread1 = new Thread(new Worker());
        System.out.println("Thread state - " + thread1.getState());

        thread1.start();
        System.out.println("Thread state - " + thread1.getState());

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread state - " + thread1.getState());

        System.out.println("Method main stopped");
    }
}

class Worker implements Runnable {
    public void run() {
        System.out.println("Work Begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(("Work Ends"));
    }
}
