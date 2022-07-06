package map;

import java.util.TreeMap;

public class TreeMapExample_1 {
    public static void main(String[] args) {
        TreeMap<Student , Double> treeMap = new TreeMap<>();

        Student st1 = new Student("Edward", "Wood", 4);
        Student st2 = new Student("Cris", "Littlewood", 2);
        Student st3 = new Student("John", "Bigwood", 3);
        Student st4 = new Student("Jessy", "Wendell", 1);
        Student st5 = new Student("Gary", "Moore", 2);
        Student st6 = new Student("Paul", "Taylor", 5);
        Student st7 = new Student("Josef", "Smith", 4);


        treeMap.put(st7, 3.6);
        treeMap.put(st2, 4.2);
        treeMap.put(st4, 4.9);
        treeMap.put(st3, 3.9);
        treeMap.put(st1, 4.6);
        treeMap.put(st5, 5.0);
        treeMap.put(st6, 4.1);

        System.out.println(treeMap);


    }
}
