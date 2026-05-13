package com.softserve.academy.module7.hw.task2;

public abstract class Passenger {

    private int passengers;

    public Passenger(int passengers) {
        if (passengers < 0) {
            throw new IllegalArgumentException("Number of passengers cannot be negative.");
        }
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
