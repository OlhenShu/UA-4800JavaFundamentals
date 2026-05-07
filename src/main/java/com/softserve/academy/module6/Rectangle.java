package com.softserve.academy.module6;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    private int getPerimeter() {
        return 2 * (width + height);
    }

//    public int getArea() {
//        return width * height;
//    }
}
