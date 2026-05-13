package com.softserve.academy.module7.pracTask.task2;

public abstract class Person {

    private static final String TYPE_PERSON = "Person";

    protected String name;

    public Person(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        System.out.println(TYPE_PERSON + " created\n");
    }

    public abstract void print();

}
