package quiz.student_management.service;

import quiz.student_management.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void getStudentById (String id) {

    }
}
