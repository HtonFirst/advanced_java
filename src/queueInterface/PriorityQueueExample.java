package queueInterface;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(5);
        priorityQueue.add(6);
        priorityQueue.add(1);
        priorityQueue.add(9);
        priorityQueue.add(12);

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}
