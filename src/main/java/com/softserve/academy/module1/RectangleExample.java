package com.softserve.academy.module1;

import java.awt.Rectangle;

public class RectangleExample {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(30, 10);
        Rectangle rect2 = new Rectangle(25, 15);
        boolean isPresent = true;
        double perimeter1 = 2 * (rect1.getWidth() + rect1.getHeight());
        double perimeter2 = 2 * (rect2.getWidth() + rect2.getHeight());
        System.out.println("\"Rect1\" Perimeter: " + perimeter1);
        System.out.println("'Rect1' Dimension : " + rect1.getSize());
        System.out.println("Rect2 \tPerimeter: " + perimeter2);
        System.out.println("\nRect2 \\Location: " + rect2.getLocation());
    }
}
