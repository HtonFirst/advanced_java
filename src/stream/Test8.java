package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {

        Student st1 = new Student("Herbert", 'm', 19, 3, 4.5);
        Student st2 = new Student("Bryan", 'm', 18, 2, 4.3);
        Student st3 = new Student("Helen", 'f', 20, 4, 4.7);
        Student st4 = new Student("Josh", 'm', 18, 1, 4.1);
        Student st5 = new Student("Mariya", 'f', 21, 5, 4.6);
        Student st6 = new Student("Paul", 'm', 21, 5, 4.7);
        Student st7 = new Student("Gina", 'f', 18, 2, 4.3);

        List<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);

        Map<Integer, List<Student>> map = students.stream()
                .map(el -> {el.setName(el.getName().toUpperCase()); return el;})
                .collect(Collectors.groupingBy(e -> e.getCourse()));

        for (Map.Entry<Integer, List<Student>> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }

        Map<Boolean, List<Student>> map1 = students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 4.5));

        for (Map.Entry<Boolean, List<Student>> entry: map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
