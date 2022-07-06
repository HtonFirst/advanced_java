package list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";

        boolean isPalindrome = true;

        List<Character> list = new LinkedList<>();

        for (Character ch: s.toCharArray()) {
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());

        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(String.format("%s - palindrome", s));
        } else { System.out.println(String.format("%s - is not palindrome", s)); }
    }


}
