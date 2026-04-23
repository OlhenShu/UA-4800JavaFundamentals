package com.softserve.academy.module3;

import java.util.Objects;

/**
 * Represents a student with attributes such as first name, last name, age, group, and faculty.
 * Also maintains a static count of the number of student instances created.
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String group;
    private String faculty;
    public static int studentCount = 0;

    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.group = "";
        this.faculty = "";
            studentCount++;
    }

    public Student(String firstName, String lastName, int age, String group, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.group = group;
        this.faculty = faculty;
            studentCount++;
    }

    public Student(String firstName, String lastName, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.faculty = faculty;
            studentCount++;
    }
//Compile error because of the same signature of the constructor as the previous one
//    public Student(String lastName, String firstName, String group) {
//        this.lastName = lastName;
//        this.firstName = firstName;
//        this.faculty = group;
//    }

    public void print() {
        System.out.println("Hello!");
    }

    public String userInfo() {
        return firstName + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}


