package com.softserve.academy.module9.hw;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FullName fullName = new FullName();
        fullName.setFirstName("John");
        fullName.setLastName("Doe");

        List<Student> students = new ArrayList<>();
        Student student = new Student(fullName, 20, 2);
        Student student1 = new Student(new FullName("Jane", "Juliet"), 22, 3);
        students.add(student);
        students.add(student1);

        for (Student s : students) {
            System.out.println(s.info());
            System.out.println(s.activity());
            System.out.println(s);
            System.out.println("------------------------------");
        }
        Student clonedStudent = null;
        try {
            clonedStudent = (Student) student.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        clonedStudent.setCourse(4);
        System.out.println("Cloned Student:");
        System.out.println(clonedStudent.info());
        System.out.println(clonedStudent.activity());
        System.out.println(clonedStudent);
    }

}
