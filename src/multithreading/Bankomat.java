package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {

    Lock lock = new ReentrantLock();

    Customer customer1 = new Customer("John", lock);
    Customer customer2 = new Customer("Edward", lock);
    Thread.sleep(5000);
    Customer customer3 = new Customer("Gary", lock);
    Customer customer4 = new Customer("Jack", lock);
    Customer customer5 = new Customer("Helen", lock);


   }
}

class Customer extends Thread {

    String name;
    private Lock lock;

    public Customer(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if(lock.tryLock()) {
            try {
//            System.out.println(name + " waiting to start banking");
//            lock.lock();
                System.out.println(name + " start banking");
                Thread.sleep(2000);
                System.out.println(name + " ends banking");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " feel bored");
        }
    }
}
