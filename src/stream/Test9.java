package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
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

        Student min = students.stream().min((x, y) -> x.getAge() - y.getAge()).get();
        System.out.println(min.toString());

        Student maxAvg = students.stream().max((x, y) -> (int) (x.getAvgGrade() - y.getAge()) *100).get();

        System.out.println(maxAvg.toString());
        System.out.println("________________________________________________________");
        students.stream().filter(e -> e.getAge()>19).limit(2).forEach(System.out::println);
        System.out.println("________________________________________________________");
        students.stream().filter((e -> e.getAge()>18)).skip(2).forEach(System.out::println);
        System.out.println("________________________________________________________");

        List<Integer> courses = students.stream().mapToInt(e ->e.getCourse())
                .boxed().collect(Collectors.toList());

        List<Double> avgGrades = students.stream().mapToDouble(e -> e.getAvgGrade())
                .boxed().collect(Collectors.toList());

        System.out.println(courses);
        System.out.println(avgGrades);
        System.out.println("________________________________________________________");

        int sum = students.stream().mapToInt(e -> e.getCourse()).sum();
        System.out.println(sum);

        double average = students.stream().mapToDouble(e -> e.getAvgGrade()).average().getAsDouble();
        System.out.println(average);
    }

}
