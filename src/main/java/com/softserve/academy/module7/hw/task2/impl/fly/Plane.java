package com.softserve.academy.module7.hw.task2.impl.fly;

import com.softserve.academy.module7.hw.task2.impl.FlyingVehicle;

public class Plane extends FlyingVehicle {

    private int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        if (maxDistance < 0) {
            throw new IllegalArgumentException("Maximum distance cannot be negative.");
        }
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("The plane is flying with maximum distance of " + maxDistance);
    }

    @Override
    public void land() {
        System.out.println("The plane is landing.");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }
}
