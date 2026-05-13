package com.softserve.academy.module7.hw.task2.impl.fly;

import com.softserve.academy.module7.hw.task2.impl.FlyingVehicle;

public class Helicopter extends FlyingVehicle {

    private int weight;
    private int maxHeight;

    public Helicopter(int passengers) {
        super(passengers);
    }

    @Override
    public void fly() {
        System.out.println("The helicopter is flying and his weight is " + weight);
    }

    @Override
    public void land() {
        System.out.println("The helicopter is landing and his max height is " + maxHeight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}
