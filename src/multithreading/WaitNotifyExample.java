package multithreading;

public class WaitNotifyExample {

    public static void main(String[] args) {

        BreadMarket market = new BreadMarket();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}

class BreadMarket {

    public static final Object lock = new Object();
    public int breadCount = 0;

    public void getBread() {
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                   lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            breadCount--;
            System.out.println("Customer buy one bread");
            System.out.println(breadCount + " - breads in market");
            lock.notify();
        }
    }

    public void putBread() {
        synchronized (lock) {
            while (breadCount >= 5) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            breadCount++;
            System.out.println("Producer put one bread on market");
            System.out.println(breadCount + " - breads in market");
            lock.notify();
        }

    }
}

class Producer implements Runnable {
   BreadMarket market;

    public Producer(BreadMarket market) {
        this.market = market;

    }

    public void run() {

        for (int i=1; i<=10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    BreadMarket market;
    public Consumer(BreadMarket market) {
        this.market= market;
    }

    public void run() {
        for (int i=1; i<=10; i++) {
            market.getBread();
        }
    }
}