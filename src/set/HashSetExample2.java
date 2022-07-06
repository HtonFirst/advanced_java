package set;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();

        set1.add(3);
        set1.add(2);
        set1.add(1);
        set1.add(5);
        set1.add(8);

        HashSet<Integer> set2 = new HashSet<>();

        set2.add(7);
        set2.add(4);
        set2.add(5);
        set2.add(3);
        set2.add(8);

        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        System.out.println("union set - " + unionSet);

        HashSet<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);

        System.out.println("intersect = " + intersectSet);

        HashSet<Integer> subtractSet = new HashSet<>(set1);
        subtractSet.removeAll(set2);

        System.out.println("subset  = " + subtractSet);

    }
}
