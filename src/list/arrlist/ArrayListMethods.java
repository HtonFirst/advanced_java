package list.arrlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> spisok1 = new ArrayList<>();
        spisok1.add("Alex");
        spisok1.add("Ivan");
        spisok1.add("Paul");
        spisok1.add(1, "Maria");

        //System.out.println(spisok1);

        for(Iterator<String> iter = spisok1.listIterator(); iter.hasNext();) {
            String s = iter.next();
            System.out.println(s);
        }
        System.out.println();
        System.out.println(spisok1.get(2));

        System.out.println();

//        for (int i = 0; i < spisok1.size(); i++) {
//            System.out.println(spisok1.get(i));
//        }

        spisok1.set(2, "Denis");
        System.out.println(spisok1);





    }


}
