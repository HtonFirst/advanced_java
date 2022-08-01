package multithreading;

public class Example3 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new myThread3());
        Thread thread2 = new Thread(new myThread4());

        thread1.start();
        thread2.start();


    }

}
class myThread3 implements Runnable {
    @Override
    public void run() {
        for (int i=1; i<=1000; i++) {
            System.out.println(i);
        }
    }
}
class myThread4 implements Runnable {
    @Override
    public void run() {
        for (int i=1000; i>0; i--) {
            System.out.println(i);
        }
    }
}