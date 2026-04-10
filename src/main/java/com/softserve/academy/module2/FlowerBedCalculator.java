package com.softserve.academy.module2;

import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        System.out.println("Input the radius of the flower bed: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        System.out.println("Your value is : " + radius);

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Your perimeter is : " + perimeter);
        System.out.println("Your area is : " + area);

        sc.close();
    }
}
