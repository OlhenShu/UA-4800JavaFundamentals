package com.softserve.academy.module6.demoabstract;

public class Cube extends Shape implements Volumetric, Vertexable {
    private final int side;

    public Cube(int side) {
        this.side = side;
    }

    @Override
    public int getPerimeter() {
        return 12 * side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public int getNumberOfVertices() {
        return 12;
    }
}
