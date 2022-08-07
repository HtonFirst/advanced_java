package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class ThreadPoolExample1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");

//        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for(int i=0; i<10; i++) {
            executorService.execute(new PrintThreadNameRunnable());
        }

        executorService.shutdown();
//        executorService.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("main ends");
    }

}

class  PrintThreadNameRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Start work");
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "Ends work");
    }
}
