package set;

import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();

        Student st1 = new Student("John", 2);
        Student st2 = new Student("Helen", 3);
        Student st3 = new Student("Gary", 1);
        Student st4 = new Student("Peter", 4);
        Student st5 = new Student("Edward", 5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println(students);
        System.out.println(students.first());
        System.out.println(students.last());

        Student st6 = new Student("Ron", 2);
        Student st7 = new Student("Bobby", 4);

        System.out.println(students.headSet(st6));
        System.out.println(students.tailSet(st6));
        System.out.println("----------------------");
        System.out.println(students.subSet(st6, st7));
        System.out.println("----------------------");
        System.out.println(st6.equals(st1));
        System.out.println(st1.hashCode());
        System.out.println(st6.hashCode());


    }
}
