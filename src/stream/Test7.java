package stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {

        Student st1 = new Student("Herbert", 'm', 19, 3, 4.5);
        Student st2 = new Student("Bryan", 'm', 18, 2, 4.3);
        Student st3 = new Student("Helen", 'f', 20, 4, 4.7);
        Student st4 = new Student("Josh", 'm', 18, 1, 4.1);
        Student st5 = new Student("Mariya", 'f', 21, 5, 4.6);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentsToFaculty(st1);
        f1.addStudentsToFaculty(st2);
        f1.addStudentsToFaculty(st3);
        f2.addStudentsToFaculty(st4);
        f2.addStudentsToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(student -> System.out.println(student.getName()));


    }
}
