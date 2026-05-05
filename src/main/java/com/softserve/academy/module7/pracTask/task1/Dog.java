package com.softserve.academy.module7.pracTask.task1;

public class Dog implements Animal {

    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed() {
        System.out.println("Dog is eating");
    }
}
