package com.softserve.academy.module7.hw.task2.impl;

public class Liner extends WaterVehicle {

    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        if (floors < 0) {
            throw new IllegalArgumentException("Number of floors cannot be negative.");
        }
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("The liner is sailing with " + getPassengers() + " passengers on board and has " + floors + " floors.");
    }
}
