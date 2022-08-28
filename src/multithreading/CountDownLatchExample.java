package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static CountDownLatch countDownLatch = new CountDownLatch(3);

    public static void stuffIsReady() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Stuff came to job");
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount() + " = count");
    }
    public static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything ready for sale");
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount() + " = count");
    }

    public static void storeIsOpened() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Store is opened");
        countDownLatch.countDown();
        System.out.println(countDownLatch.getCount() + " = count");
    }

    public static void main(String[] args) throws InterruptedException {

        Friend friend1 = new Friend("Josh", countDownLatch);
        Friend friend2 = new Friend("Helen", countDownLatch);
        Friend friend3 = new Friend("Vanessa", countDownLatch);
        Friend friend4 = new Friend("Peter", countDownLatch);
        Friend friend5 = new Friend("Edward", countDownLatch);

        stuffIsReady();
        everythingIsReady();
        storeIsOpened();

    }
}

class Friend extends Thread {

    private String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " start shopping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
