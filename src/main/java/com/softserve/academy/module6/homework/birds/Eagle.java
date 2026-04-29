package com.softserve.academy.module6.homework.birds;

public class Eagle extends FlyingBird {

    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("Eagle soaring high with wide wings outstretched, gliding smoothly through the air with minimal effort.");
    }

    @Override
    public void info() {
        super.info();
    }
}
