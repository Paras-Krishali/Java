package com.student;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class StudentService {

    void addStudent(Student s) throws InvalidMarksException {

        if (s.marks < 0 || s.marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }

        try {

            FileWriter fw = new FileWriter("students.txt", true);

            fw.write(s.studentId + " " + s.name + " " + s.marks + "\n");

            fw.close();

            System.out.println("Student added successfully");

        }
        catch (IOException e) {

            System.out.println("Error writing to file");

        }
    }

    void displayStudents() {

        try {

            FileReader fr = new FileReader("students.txt");

            int i;

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

            fr.close();

        }
        catch (FileNotFoundException e) {

            System.out.println("File not found");

        }
        catch (IOException e) {

            System.out.println("Error reading file");

        }
    }


}
