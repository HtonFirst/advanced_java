package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
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

        students = students.stream()
                .filter(element -> (element.getAge()<20 && element.getAvgGrade()>4.2)).collect(Collectors.toList());

        System.out.println(students);

        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        List stud2 = myStream.filter(e->e.getAge()>20).collect(Collectors.toList());

        System.out.println(stud2);


    }
}
