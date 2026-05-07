package com.softserve.academy.module6.demoabstract;

public class ShapeDemo {
    public static void main(String[] args) {
//        Shape rectangle = new Rectangle(5, 10);
//        rectangle.display();
//
//        Shape parallelogram = new Parallelogram(5, 10, 7);
//        parallelogram.display();
//
//        Shape square = new Square(5);
//        square.display();

        Shape[] shapes = {
                new Rectangle(5, 10),
                new Rectangle(3, 4),
                new Parallelogram(5, 10, 7),
                new Parallelogram(3, 4, 2),
                new Square(5),
                new Square(3),
                new Square(7)
        };

        for (int i=0; i< shapes.length; i++) {
            shapes[i].display();
        }

        for (Shape figures : shapes) {
            figures.display();
        }

    }
}
