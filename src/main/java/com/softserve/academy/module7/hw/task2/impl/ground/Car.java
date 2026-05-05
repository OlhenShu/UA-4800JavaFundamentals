package com.softserve.academy.module7.hw.task2.impl.ground;

import com.softserve.academy.module7.hw.task2.impl.GroundVehicle;

public class Car extends GroundVehicle {

    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println(model + " is driving");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
