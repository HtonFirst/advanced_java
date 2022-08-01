package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

        System.out.println(5&1);

        int res = Arrays.stream(array).filter(e ->(e&1)==1)
                .map(e->{if (e%3==0){e/=3;}return e;})
                .reduce((a,e) -> a+e).getAsInt();
        System.out.println(res);

//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));

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

        students.stream().map(e ->{e.setName(e.getName().toUpperCase()); return e;})
                .filter(e -> e.getSex() == 'f').sorted((x, y) -> x.getAge() - y.getAge())
                .forEach(System.out::println);
    //
//        System.out.println(students);
//
//        students = students.stream().sorted((e1,e2) -> e1.getName().compareTo(e2.getName()))
//                .collect(Collectors.toList());
//
//        System.out.println(students);



//
    }
}
