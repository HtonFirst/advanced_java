package thread_safe_collections;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {
    public static void main(String[] args) {


        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);


//   Producer
        new Thread(() -> {
            int i = 1;
            while (true) {
                try {
                    queue.put(i++);
                    System.out.println("Producer put " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // Consumer
        new Thread(() -> {
            while (true) {
                try {
                    Integer j = queue.take();
                    System.out.println("Consumer take " + j + " " + queue);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}