package com.softserve.academy.module6.pracTask.cars;

public abstract class Car {

    private String model;
    private int maxSpeed;
    private int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        if (maxSpeed <= 0) {
            throw new IllegalArgumentException("Max speed must be greater than 0");
        }
        if (yearOfProduction <= 0) {
            throw new IllegalArgumentException("Year of production must be greater than 0");
        }
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public void run() {
        System.out.println("Car " + model + " is running at a speed of " + maxSpeed + " km/h");
    }

    public void stop() {
        System.out.println("Car " + model + " has stopped.");
    }

    public abstract void info();

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
