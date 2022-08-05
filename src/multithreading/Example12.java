package multithreading;

public class Example12 {

     static final Object lock1 = new Object();

    void mobileCall() {
     synchronized (lock1) {
         System.out.println("Mobile call starts");
         try {
             Thread.sleep(3000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.println("Mobile call ends");
     }
    }

    void skypeCall() {
       synchronized (lock1) {
           System.out.println("Skype call starts");
           try {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("Skype call ends");
       }
    }

   void whatsappCall() {
       synchronized (lock1) {
           System.out.println("Whatsapp call starts");
           try {
               Thread.sleep(7000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("Whatsapp call ends");
       }
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new mobileRunnable());
        Thread thread2 = new Thread(new skypeRunnable());
        Thread thread3 = new Thread(new whatsappRunnable());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class mobileRunnable implements Runnable {
    @Override
    public void run() {
        new Example12().mobileCall();
    }
}

class whatsappRunnable implements Runnable {
    @Override
    public void run() {
        new Example12().whatsappCall();
    }
}

class skypeRunnable implements Runnable {
    @Override
    public void run() {
        new Example12().skypeCall();
    }
}

