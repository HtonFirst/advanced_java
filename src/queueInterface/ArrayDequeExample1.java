package queueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample1 {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(1);
        deque.addLast(4);
        deque.offerFirst(8);
        deque.offerLast(9);

        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        System.out.println("_____________________");

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        System.out.println(deque);

        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());


    }
}
