package com.softserve.academy.task1;

import java.util.Scanner;

public class FlowerBedCalculator {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius:");
        int radius = scanner.nextInt();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * (radius * radius);
        System.out.println("Perimeter = " + perimeter);
        System.out.print("Area = " + area);
        scanner.close();
    }
}