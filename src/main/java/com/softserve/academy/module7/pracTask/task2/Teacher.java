package com.softserve.academy.module7.pracTask.task2;

public class Teacher extends Staff {

    private static final String TYPE_PERSON = "Teacher";

    public Teacher(String name) {
        super(name);
        System.out.println(TYPE_PERSON + " created\n");
    }

    @Override
    public void print() {
        System.out.println("Teacher: " + name);
    }

    @Override
    public void salary() {
        System.out.println("Teacher's salary is 1000$");
    }
}
