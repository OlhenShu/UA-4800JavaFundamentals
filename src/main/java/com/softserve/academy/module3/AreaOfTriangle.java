package com.softserve.academy.module3;

import java.util.Scanner;

import static java.lang.System.in;

public class AreaOfTriangle {
    public static void main(String[] args) {

        double side1 = getNumber("Input Side 1: ");
        double side2 = getNumber("Input Side 2: ");
        double side3 = getNumber("Input Side 3: ");

        if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2) {
            double s = (side1 + side2 + side3) / 2.0;
            double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            System.out.println("The area of the triangle is: " + "[" + area + "]");
        } else System.out.println("incorrect triangle!");
    }


    public static double getNumber(String text) {
        System.out.print(text);
        Scanner scan = new Scanner(in);
        return Double.parseDouble(scan.nextLine());
    }
}


