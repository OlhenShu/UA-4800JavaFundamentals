package com.softserve.academy.module7.hw.task2.impl.sail;

import com.softserve.academy.module7.hw.task2.impl.WaterVehicle;

public class Boat extends WaterVehicle {

    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("The boat is sailing with " + getPassengers() + " passengers on board and has " + volume + " volume.");
    }
}
