package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(8);
        set.add(1);
        set.add(5);
        set.add(10);

        System.out.println(set);

        set.remove(2);

        System.out.println(set);

        System.out.println(set.contains(2));
        System.out.println(set.contains(5));


    }
}
