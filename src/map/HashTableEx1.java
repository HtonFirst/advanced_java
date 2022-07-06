package map;

import java.util.Hashtable;

public class HashTableEx1 {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashTable = new Hashtable<>();

        Student st1 = new Student("Edward", "Wood", 4);
        Student st2 = new Student("Cris", "Littlewood", 2);
        Student st3 = new Student("John", "Bigwood", 3);

        hashTable.put(4.3, st1);
        hashTable.put(4.0, st2);
        hashTable.put(3.8, st3);

        System.out.println(hashTable);
    }
}
