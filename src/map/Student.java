package map;

import java.util.Objects;

public class Student  implements Comparable<Student>{

    public String name;
    public String surName;
    public int course;

    public Student(String name, String surName, int course) {
        this.name = name;
        this.surName = surName;
        this.course = course;
    }

    @Override
    public String toString() {
        return (String.format("(%s %s course-%d)", name, surName, course));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surName, student.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, course);
 //       return (name.length()*7 + surName.length()*11 + course*53);
    }

    @Override
    public int compareTo(Student o) {
        return this.surName.compareTo(o.surName);
    }
}
