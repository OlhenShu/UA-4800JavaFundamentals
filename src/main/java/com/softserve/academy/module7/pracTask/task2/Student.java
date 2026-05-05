package com.softserve.academy.module7.pracTask.task2;

public class Student extends Person {

    private static final String TYPE_PERSON = "Student";

    public Student(String name) {
        super(name);
        System.out.println(TYPE_PERSON + " created\n");
    }

    @Override
    public void print() {
        System.out.println("Student: " + name);
    }
}
