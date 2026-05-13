package com.softserve.academy.module7.pracTask.task2;

public class Cleaner extends Staff {

    private static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        super(name);
        System.out.println(TYPE_PERSON + " created\n");
    }

    @Override
    public void print() {
        System.out.println("I am a " + name);
    }

    @Override
    public void salary() {
        System.out.println("Cleaner's salary is 500$");
    }
}
