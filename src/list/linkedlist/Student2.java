package list.linkedlist;

import list.arrlist.Student;

public class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }
    @Override
    public String toString() {
        return String.format("Student name: %s course: %d", name, course);
    }
}
