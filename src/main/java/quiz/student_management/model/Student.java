package quiz.student_management.model;

public class Student {
    private String id;
    private String name;
    private int grade;

    Student (String id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + "name='" + name + "', grade=" + grade + "}";
    }
}
