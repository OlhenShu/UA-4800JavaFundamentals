package com.softserve.academy.module6.pracTask.cars;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void info() {
        System.out.println("Truck " + getModel() +
                " is a powerful vehicle with a maximum speed of " + getMaxSpeed() +
                " km/h, produced in " + getYearOfProduction());
    }

}
