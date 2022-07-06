package list.arrlist;

import java.util.ArrayList;

public class ArrayLIstMethods2 {
    public static void main(String[] args) {

        Student st1 = new Student("Alex", 'm', 19, 3, 4.8 );
        Student st2 = new Student("Denis", 'm', 20, 4, 3.2 );
        Student st3 = new Student("Maria", 'f', 18, 2, 4.5 );
        Student st4 = new Student("Bill", 'm', 18, 2, 4.1 );
        Student st5 = new Student("Elen", 'f', 21, 5, 4.0 );

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        System.out.println(studentList);

        Student st6 = new Student("Maria", 'f', 18, 2, 4.5);
        studentList.remove(st6);

        System.out.println(studentList);

    }
}
