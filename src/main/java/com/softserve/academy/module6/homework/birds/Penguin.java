package com.softserve.academy.module6.homework.birds;

public class Penguin extends NonFlyingBird {

    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Penguins can't fly in air, but none of their food is in the air.");
    }

    @Override
    public void info() {
        super.info();
    }
}
