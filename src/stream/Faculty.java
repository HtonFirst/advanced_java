package stream;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentsToFaculty(Student student) {
        studentsOnFaculty.add(student);
    }
}
