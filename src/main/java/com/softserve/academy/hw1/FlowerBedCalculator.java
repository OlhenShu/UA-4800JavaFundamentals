package com.softserve.academy.hw1;


import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Flower bed radius is " + radius);
        System.out.printf("Perimeter is %.2f\n", perimeter);
        System.out.printf("Area is %.2f", area);

        sc.close();

    }

}

