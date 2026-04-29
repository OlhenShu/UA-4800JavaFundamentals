package com.softserve.academy.module6.pracTask.cars;

public class Sedan extends Car {

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void info() {
        System.out.println("Sedan " + getModel() +
                " is a comfortable car with a maximum speed of " + getMaxSpeed() +
                " km/h, produced in " + getYearOfProduction());
    }
}
