package com.softserve.academy.module6;

public class Parallelogram extends Rectangle {
    public int angle;

    public Parallelogram() {
    }

    public Parallelogram(int width, int height, int angle) {
        super(width, height);
        this.angle = angle;
    }

//    @Override
//    public int getPerimeter() {
//        return 2 * (width + height);
//    }

//    public double getArea() {
//        return width * height * Math.sin(Math.toRadians(angle));
//    }
}
