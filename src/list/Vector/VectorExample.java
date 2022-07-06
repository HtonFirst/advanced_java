package list.Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("Alex");
        vector.add("Willy");
        vector.add("Bob");
        vector.add("Elen");
        vector.add("Tom");
        vector.add("Scarlet");

        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));

    }
}
