package set;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Matt");
        set.add("Helen");
        set.add("John");
        set.add("Peter");
        set.add("Liz");
//        set.add(null);

        System.out.println(set);

        set.remove("John");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Michael"));
    }
}
