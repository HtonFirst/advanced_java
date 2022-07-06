package list.arrlist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<String> spisok1 = new ArrayList<>();
        spisok1.add("Alex");
        spisok1.add("Ivan");
        spisok1.add("Paul");
        spisok1.add("Maria");
        spisok1.add("Elen");

        Iterator<String> iterator = spisok1.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println(spisok1);
    }

}
