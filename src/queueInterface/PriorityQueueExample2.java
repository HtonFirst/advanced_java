package queueInterface;

import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {

        PriorityQueue<Student> students = new PriorityQueue<>();

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

        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());
        System.out.println(students.poll());


    }
}
