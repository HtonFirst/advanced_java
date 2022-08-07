package multithreading;

public class InterruptionExample {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("main starts");

        SqrtSumFind thread = new SqrtSumFind();

        thread.start();
        Thread.sleep(2000);
        thread.interrupt();


        thread.join();

        System.out.println("main ends");

    }
}

class SqrtSumFind extends Thread {
    double sqrtSum = 0;

    public void run() {

        for(int i=1; i<=1_000_000_000; i++) {
            if(isInterrupted()) {
                System.out.println("thread need interruption");
                break;
            }
            sqrtSum+=Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interruption exception");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }

}
