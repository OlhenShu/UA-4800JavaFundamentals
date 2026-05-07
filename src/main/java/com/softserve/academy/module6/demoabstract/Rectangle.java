package com.softserve.academy.module6.demoabstract;

public class Rectangle extends Shape {
    private int width;
    private int height;
    private int angle = 90;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return (double) width * height;
    }
}
