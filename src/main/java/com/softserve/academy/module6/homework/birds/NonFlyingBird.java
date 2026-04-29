package com.softserve.academy.module6.homework.birds;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird cannot fly.");
    }

    @Override
    public void info() {
        System.out.println("This is a non-flying bird with " + getFeathers() + " feathers. It " + (isLayEggs() ? "lays eggs." : "does not lay eggs."));
    }
}
