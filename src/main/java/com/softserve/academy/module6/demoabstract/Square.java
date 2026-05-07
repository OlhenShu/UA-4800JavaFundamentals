package com.softserve.academy.module6.demoabstract;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }
}
