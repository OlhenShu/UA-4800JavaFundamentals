package com.softserve.academy.module7.pracTask.task2;

public abstract class Staff extends Person {

    private static final String TYPE_PERSON = "Staff";

    public Staff(String name) {
        super(name);
        System.out.println(TYPE_PERSON + " created\n");
    }

    public abstract void salary();

}
