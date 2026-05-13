package com.softserve.academy.module6.homework.birds;

public class Swallow extends FlyingBird {

    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Swallows are birds with amazing flying abilities.");
    }

    @Override
    public void info() {
        super.info();
    }
}
