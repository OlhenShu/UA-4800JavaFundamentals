package com.softserve.academy.module6.demoabstract;

public class Parallelogram extends Shape {
    private int width;
    private int height;
    private int angle;

    public Parallelogram(int width, int height, int angle) {
        this.width = width;
        this.height = height;
        this.angle = angle;
    }
    @Override
    public int getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public double getArea() {
        return width * height * Math.sin(Math.toRadians(angle));
    }
}
