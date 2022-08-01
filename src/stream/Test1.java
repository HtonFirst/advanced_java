package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Privet");
        list.add("Kak dela?");
        list.add("Otlichno");
        list.add("Poka");

//        System.out.println(list);
//
//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

        List<Integer> list2 = list.stream().map(str ->str.length()).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};

        array = Arrays.stream(array).map(element -> {
            if (element % 3 ==0) {
                element = element/3;
            }
            return element;
        }).toArray();

        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();

        set.add("Privet");
        set.add("Kak dela?");
        set.add("Otlichno");
        set.add("Poka");

        System.out.println(set);

        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());

        System.out.println(set2);
    }
}
