package multithreading;

public class Example5 {
    public static void main(String[] args) {

        MyThread5 myThread5 = new MyThread5();

        myThread5.setName("my thread number one");
        myThread5.setPriority(9);
        System.out.println("myThread5 name - " + myThread5.getName() + " priority - " + myThread5.getPriority());

        MyThread5 myThread51 = new MyThread5();
        myThread51.setPriority(Thread.MAX_PRIORITY);
        System.out.println("myThread51 name - " + myThread51.getName() + " priority - " + myThread51.getPriority());


    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("Privet");
    }
}
