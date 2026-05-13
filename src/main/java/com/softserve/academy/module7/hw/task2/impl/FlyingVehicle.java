package com.softserve.academy.module7.hw.task2.impl;

import com.softserve.academy.module7.hw.task2.Passenger;
import com.softserve.academy.module7.hw.task2.Vehicle;

public abstract class FlyingVehicle extends Passenger implements Vehicle {

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    public void fly() {
        System.out.println("The flying vehicle is flying.");
    }

    public void land() {
        System.out.println("The flying vehicle is landing.");
    }
}
