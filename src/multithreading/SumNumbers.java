package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumbers {

    static Long number = 1_000_000_000L;
    static Long sum = 0L;

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Long dividedNumber = number/10;
        List<Future<Long>> sumList = new ArrayList<>();

        for(int i=0; i<10; i++) {
            Long from = dividedNumber*i + 1;
            Long to = dividedNumber*(i+1);

            PartialSum partialSum = new PartialSum(from, to);
            Future<Long> future = executorService.submit(partialSum);
            sumList.add(future);
        }

        for(Future<Long> p: sumList) {
            Long sp = p.get();
            System.out.println(sp);
            sum +=sp;
        }

        executorService.shutdown();
        System.out.println(sum);

    }


}

class PartialSum implements Callable<Long> {
    Long from;
    Long to;
    Long partSum = 0L;

    public PartialSum(Long from, Long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() throws Exception {
        for(Long i=from; i<=to; i++) {
            partSum+=i;
        }
        return partSum;
    }
}
