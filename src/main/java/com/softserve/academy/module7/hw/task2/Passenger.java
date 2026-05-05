package com.softserve.academy.module7.hw.task2;

public abstract class Passenger {

    private int passengers;

    public Passenger(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
