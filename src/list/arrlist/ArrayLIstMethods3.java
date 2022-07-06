package list.arrlist;

import java.util.ArrayList;

public class ArrayLIstMethods3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("John");
        names.add("Vinni");

        System.out.println(names);

        ArrayList<String> symbols = new ArrayList<>();
        symbols.add("!!!!");
        symbols.add("????");

        names.addAll(1, symbols);

        System.out.println(names);

        System.out.println(names.indexOf("John"));

        names.add("Alex");

        System.out.println(names.lastIndexOf("Alex"));

        System.out.println(names.contains("Alex"));
        System.out.println(names.contains("Ivan"));
        System.out.println();

        //names.remove("????");
        System.out.println(names.containsAll(symbols));

        System.out.println();

        System.out.println(names.isEmpty());

        names.clear();

        System.out.println(names.isEmpty());



    }
}
