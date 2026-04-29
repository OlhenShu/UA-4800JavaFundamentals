package com.softserve.academy.module6.homework.birds;

public class Kiwi extends NonFlyingBird {

    public Kiwi(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Kiwi birds cannot fly but they are excellent runners and use their strong legs to zoom through the forest.");
    }

    @Override
    public void info() {
        super.info();
    }
}
