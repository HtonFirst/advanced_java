package multithreading;

public class Example4 {
    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Privet");
            }
        });

        thread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Snova Privet");
            }
        }).start();

        new Thread(() -> System.out.println("I Snova Privet")).start();
    }
}
