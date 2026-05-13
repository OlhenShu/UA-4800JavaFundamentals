package com.softserve.academy.module7.hw.task2.impl.ground;

import com.softserve.academy.module7.hw.task2.impl.GroundVehicle;

public class Motorcycle extends GroundVehicle {

    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        if (maxSpeed < 0) {
            throw new IllegalArgumentException("Max speed cannot be negative.");
        }
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("The motorcycle is driving at a speed of " + maxSpeed + " km/h.");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
