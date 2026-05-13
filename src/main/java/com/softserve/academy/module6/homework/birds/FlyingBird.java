package com.softserve.academy.module6.homework.birds;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird can fly.");
    }

    @Override
    public void info() {
        System.out.println("This is a flying bird with " + getFeathers() + " feathers. It " + (isLayEggs() ? "lays eggs." : "does not lay eggs."));
    }
}
