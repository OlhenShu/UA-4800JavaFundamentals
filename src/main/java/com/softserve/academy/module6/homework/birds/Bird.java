package com.softserve.academy.module6.homework.birds;

public abstract class Bird {

    private String feathers;
    private boolean layEggs;

    public Bird(String feathers, boolean layEggs) {
        if (feathers == null || feathers.isEmpty()) {
            throw new IllegalArgumentException("Feathers description cannot be null or empty.");
        }
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public abstract void info();
}
