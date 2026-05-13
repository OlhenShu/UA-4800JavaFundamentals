package com.softserve.academy.module7.hw.task2.impl.ground;

import com.softserve.academy.module7.hw.task2.impl.GroundVehicle;

public class Bus extends GroundVehicle {

    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        if (route == null || route.isEmpty()) {
            throw new IllegalArgumentException("Route cannot be null or empty.");
        }
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("The bus is driving on route: " + route);
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
