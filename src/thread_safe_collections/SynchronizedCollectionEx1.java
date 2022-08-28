package thread_safe_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionEx1 {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> source = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            source.add(i);
        }

        List<Integer> target = new ArrayList<>();
        List<Integer> synchList =
                Collections.synchronizedList(new ArrayList<>());

//        Runnable runnable = () -> target.addAll(source);
          Runnable runnable = () -> synchList.addAll(source);


        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(target);
        System.out.println(synchList);
    }
}
