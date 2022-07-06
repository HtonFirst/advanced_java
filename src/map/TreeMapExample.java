package map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student st1 = new Student("Edward", "Wood", 4);
        Student st2 = new Student("Cris", "Littlewood", 2);
        Student st3 = new Student("John", "Bigwood", 3);
        Student st4 = new Student("Jessy", "Wendell", 1);
        Student st5 = new Student("Gary", "Moore", 2);
        Student st6 = new Student("Paul", "Taylor", 5);
        Student st7 = new Student("Josef", "Smith", 4);


        treeMap.put(3.6, st7);
        treeMap.put(4.2, st2);
        treeMap.put(4.9, st4);
        treeMap.put(3.9, st3);
        treeMap.put(4.6, st1);
        treeMap.put(5.0, st5);
        treeMap.put(4.1, st6);

        System.out.println(treeMap);
//        System.out.println(treeMap.get(5.0));
//        treeMap.remove(3.6);
//        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(4.0));
        System.out.println(treeMap.headMap(4.0));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());

    }
}
