package com.softserve.academy.module6.upcasting;

public class Shape {
    double side;
    String name;

    public Shape(double side, String name) {
        this.side = side;
        this.name = name;
    }

    public double getArea() {
        return 42;
    }
}

class Square extends Shape {
    double side;

    public Square(double side) {
        super(side, "Square");
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    void display() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + getArea());
        System.out.println("*-*".repeat(10));
    }
}

class Demo {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square.getArea());
        square.display();

        Shape shape = new Square(5);
        shape.getArea();
       ((Square) shape).display(); // Error: method display() is not defined in Shape
        if(shape instanceof Square) {
            ((Square) shape).display();
        }
    }
}


