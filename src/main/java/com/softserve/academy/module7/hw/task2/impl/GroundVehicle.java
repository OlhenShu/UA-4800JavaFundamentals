package com.softserve.academy.module7.hw.task2.impl;

import com.softserve.academy.module7.hw.task2.Passenger;
import com.softserve.academy.module7.hw.task2.Vehicle;

public abstract class GroundVehicle extends Passenger implements Vehicle {

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    public void drive() {
        System.out.println("The ground vehicle is driving.");
    }
}
