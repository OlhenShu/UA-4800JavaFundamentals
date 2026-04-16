package com.softserve.academy.module3;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", faculty='").append(faculty).append('\'');
        sb.append('}');
        return sb.toString();
    }

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

}


