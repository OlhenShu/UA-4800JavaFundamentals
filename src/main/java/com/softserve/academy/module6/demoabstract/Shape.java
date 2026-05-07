package com.softserve.academy.module6.demoabstract;

public abstract class Shape {
    public abstract int getPerimeter();

    public abstract double getArea();


    public void display() {
        System.out.println("Shape: " + this.getClass().getSimpleName());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
        System.out.println("*-*".repeat(10));
    }
}
