package map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {

        LinkedHashMap<Double, Student> linkedHashMap =
                new LinkedHashMap<>(16, 0.75f, true);

        Student st1 = new Student("Edward", "Wood", 4);
        Student st2 = new Student("Cris", "Littlewood", 2);
        Student st3 = new Student("John", "Bigwood", 3);
        Student st4 = new Student("Jessy", "Wendell", 1);
        Student st5 = new Student("Gary", "Moore", 2);
        Student st6 = new Student("Paul", "Taylor", 5);
        Student st7 = new Student("Josef", "Smith", 4);


        linkedHashMap.put(3.6, st7);
        linkedHashMap.put(4.2, st2);
        linkedHashMap.put(4.9, st4);
        linkedHashMap.put(3.9, st3);
        linkedHashMap.put(4.6, st1);
        linkedHashMap.put(5.0, st5);
        linkedHashMap.put(4.1, st6);

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(4.9));
        System.out.println(linkedHashMap.get(5.0));

        System.out.println(linkedHashMap);

    }
}
