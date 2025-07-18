package org.example.quiz;

public class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        Student John = new Student("John", 85);
        Student Jane = new Student("Jane", 92);
        Student Tom = new Student("Tom", 78);
        Student Emily = new Student("Emily", 88);
        Student Alex = new Student("Alex", 95);

        Student[] students = {John,Jane,Tom,Emily,Alex};

        for(Student student: students) {
            if (student.score >= 90) {
                System.out.println(student.name);
            }
        }
    }
}




