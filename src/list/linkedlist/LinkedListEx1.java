package list.linkedlist;

import java.util.LinkedList;

public class LinkedListEx1 {

    public static void main(String[] args) {

        Student2 st1 = new Student2("John", 2);
        Student2 st2 = new Student2("Jessy", 3);
        Student2 st3 = new Student2("Paul", 1);
        Student2 st4 = new Student2("Elen", 5);
        Student2 st5 = new Student2("Alex", 5);

        LinkedList<Student2> student2list = new LinkedList<>();

        student2list.add(st1);
        student2list.add(st2);
        student2list.add(st3);
        student2list.add(st4);
        student2list.add(st5);

        System.out.println(student2list);
        System.out.println(student2list.get(2));

        Student2 st6 = new Student2("Pat", 3);
        Student2 st7 = new Student2("Erica", 4);

        student2list.add(st6);

        System.out.println(student2list);

        student2list.add(1, st7);
        System.out.println(student2list);

        student2list.remove(3);

        System.out.println(student2list);
    }
}
