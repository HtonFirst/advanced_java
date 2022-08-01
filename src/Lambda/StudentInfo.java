package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {

    public static void main(String[] args) {

        Student st1 =
                new Student("John", 'm', 19, 2, 4.6);
        Student st2 =
                new Student("Peter", 'm', 18, 1, 4.4);
        Student st3 =
                new Student("Helen", 'f', 21, 4, 4.9);
        Student st4 =
                new Student("Mariya", 'f', 18, 2, 4.2);
        Student st5 =
                new Student("Edward", 'm', 23, 5, 4.5);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.printStudentsOverGrade(students, 4.2);
//        System.out.println("_____________________________");
//        studentInfo.printStudentsUnderAge(students, 20);
//        System.out.println("_____________________________");
//        studentInfo.printStudentMixConditions(students, 20, 5, 'f');

//        studentInfo.testStudents(students, new checkSt());
//        System.out.println("___________________________");
//        studentInfo.testStudents(students, new studentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age>20;
//            }
//        });
        System.out.println("---------------------------");
        studentInfo.testStudents(students, s -> s.age>20);

        System.out.println("____________________________");
        studentInfo.testStudents(students, (Student stud) ->{return stud.avgGrade>4.4;});

        System.out.println("_____________________________");
        studentInfo.testStudents(students, p -> p.sex == 'f');

        System.out.println("_____________________________");

        Predicate<Student> pr1 = p1 -> p1.avgGrade > 4.4;
        Predicate<Student> pr2 = p2 -> p2.sex == 'm';

        studentInfo.testStudents(students, pr1.and(pr2));

        System.out.println("_____________________________");
        studentInfo.testStudents(students, pr1.negate());

        System.out.println("_______!!!!!!!!!!!____________");
        double res = avgSomeThing(students, st -> (double) st.age);
        System.out.println("Srednee - " + res);





    }
    public static double avgSomeThing(List<Student> studentList, Function<Student, Double> fn) {
        double result = 0;
        for (Student st: studentList) {
           result += fn.apply(st);
        }
        return result/studentList.size();
    }

    void printStudentsOverGrade(ArrayList<Student> arrSt, double gr) {
        for (Student st: arrSt) {
            if (st.avgGrade > gr) {
                System.out.println(st);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> arrSt, int age) {
        for (Student st: arrSt) {
            if (st.age < age) {
                System.out.println(st);
            }
        }
    }

    void printStudentMixConditions(ArrayList<Student> arr, int age, double grade, char sex) {
        for (Student st: arr) {
            if (st.age > age && st.avgGrade < grade && st.sex == sex) {
                System.out.println(st);
            }
        }

    }

    void  testStudents(ArrayList<Student> stList, Predicate<Student> pr) {
        for (Student student: stList) {
            if (pr.test(student)) {
                System.out.println(student);
            }
        }

    }
}
//interface studentChecks {
//    boolean check(Student s);
//}
//class checkSt implements studentChecks {
//    public boolean check(Student s) {
//        return (s.avgGrade < 4.5);
//
//    }
//}
