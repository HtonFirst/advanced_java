package list.Vector;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("John");
        stack.push("Elen");
        stack.push("Jerry");
        stack.push("Pat");
        stack.push("Vanda");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println(stack);
    }
}
