package com.softserve.academy.module7.hw.task2.impl;

import com.softserve.academy.module7.hw.task2.Passenger;
import com.softserve.academy.module7.hw.task2.Vehicle;

public abstract class WaterVehicle extends Passenger implements Vehicle {

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    public void isSailing() {
        System.out.println("The water vehicle is sailing.");
    }

}
