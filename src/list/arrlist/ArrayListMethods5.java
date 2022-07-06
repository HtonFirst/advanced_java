package list.arrlist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {

        ArrayList<String> spisok1 = new ArrayList<>();
        spisok1.add("Alex");
        spisok1.add("Ivan");
        spisok1.add("Paul");
        spisok1.add("Maria");
        spisok1.add("Elen");

        System.out.println(spisok1);
        System.out.println();

        List<String> sb = spisok1.subList(0, 4);
        System.out.println(sb);
        System.out.println();


        ArrayList<String> spisok2 = new ArrayList<>();
        spisok2.add("John");
        spisok2.add("Ivan");
        spisok2.add("Bill");
        spisok2.add("Maria");

        spisok1.removeAll(spisok2);
        System.out.println(spisok1);
        System.out.println();

        boolean result = spisok1.containsAll(spisok2);
        System.out.println(result);

        Object [] array1 = spisok1.toArray();
        String [] array2 = spisok2.toArray(new String[0]);

        System.out.println();
        for (String s: array2) {
            System.out.println(s);
        }

        List<Integer> intList = List.of(1, 2, 4, 66);
        System.out.println(intList);
        System.out.println();

        List<String> copyList = List.copyOf(spisok1);
        System.out.println(copyList);
        
    }
}
