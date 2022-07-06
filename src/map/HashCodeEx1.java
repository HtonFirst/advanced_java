package map;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEx1 {
    public static void main(String[] args) {

        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Edward", "Wood", 4);
        Student st2 = new Student("Cris", "Littlewood", 2);
        Student st3 = new Student("John", "Bigwood", 3);

        map.put(st1, 4.3);
        map.put(st2, 4.0);
        map.put(st3, 3.8);

        System.out.println(map);

        Student st4 = new Student("Edward", "Wood", 3);
        Student st5 = new Student("Bill", "Blackwood", 1);
        boolean result = map.containsKey(st4);
        System.out.println("result =  " + result);

        System.out.println(st1.equals(st4));

        System.out.println("HashCodes");
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st5.hashCode());

        for (Map.Entry<Student, Double> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ":" +entry.getValue());
        }





    }
}
