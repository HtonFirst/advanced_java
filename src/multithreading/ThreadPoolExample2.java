package multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample2 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(1);
//        for(int i=0; i<10; i++) {
//            scheduledExecutorService.execute(new RunnableImpl200());
//        }

//        scheduledExecutorService.schedule(new RunnableImpl200(),3, TimeUnit.SECONDS);
//        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(), 3, 1, TimeUnit.SECONDS);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        scheduledExecutorService.shutdown();
    }
}

class RunnableImpl200 implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}
