package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestFindFirst {
    public static void main(String[] args) {
        Student st1 = new Student("Herbert", 'm', 19, 3, 4.5);
        Student st2 = new Student("Bryan", 'm', 18, 2, 4.3);
        Student st3 = new Student("Helen", 'f', 20, 4, 4.7);
        Student st4 = new Student("Josh", 'm', 18, 1, 4.1);
        Student st5 = new Student("Mariya", 'f', 21, 5, 4.6);

        List<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

       Student firstStudent = students.stream().map(e ->{e.setName(e.getName().toUpperCase()); return e;})
                .filter(e -> e.getSex() == 'f').sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst().get();
        System.out.println(firstStudent.toString());
    }
}
