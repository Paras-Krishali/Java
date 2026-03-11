package com.student;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student s1 = new Student(1, "Rahul", 85);
        Student s2 = new Student(2, "Anita", 95);
        Student s3 = new Student(3, "John", 120);

        try {

            service.addStudent(s1);
            service.addStudent(s2);
            service.addStudent(s3);

        } catch (InvalidMarksException e) {

            System.out.println(e.getMessage());

        }

        service.displayStudents();

    }

}