package queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Helen");
        queue.offer("Peter");
        queue.offer("Edward");
        queue.offer("Mary");
        queue.offer("Jack");

        System.out.println(queue);
        System.out.println(queue.remove());

        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println("_______________");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println("_________________");
        System.out.println(queue.peek());
    }
}
