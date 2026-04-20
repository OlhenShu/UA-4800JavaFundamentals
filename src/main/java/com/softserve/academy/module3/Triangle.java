package com.softserve.academy.module3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSide, secondSide, thirdSide;

        System.out.println("Input Side 1: ");
        firstSide = scanner.nextInt();
        System.out.println("Input Side 2: ");
        secondSide = scanner.nextInt();
        System.out.println("Input Side 3: ");
        thirdSide = scanner.nextInt();

        System.out.printf("The area of the triangle is %.2f", calcTriangleArea(firstSide, secondSide, thirdSide));

        scanner.close();
    }

    private static double calcTriangleArea(int firstSide, int secondSide, int thirdSide) {
        double s = (firstSide + secondSide + thirdSide) / 2.0;

        return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
    }
}
