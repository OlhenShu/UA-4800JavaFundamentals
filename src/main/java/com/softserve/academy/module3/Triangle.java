package com.softserve.academy.module3;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input Side 1: ");
            int a = scanner.nextInt();
            System.out.print("Input Side 2: ");
            int b = scanner.nextInt();
            System.out.print("Input Side 3: ");
            int c = scanner.nextInt();
            double area = triangle.triangleArea(a, b, c);
            System.out.println("The area of the triangle is " + Math.round(area * 100.0) / 100.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter positive integers only.");
        }
    }

    public double triangleArea(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0 || !(a + b > c && a + c > b && b + c > a)) {
            throw new IllegalArgumentException("Sides must be positive");
        }
        double s = (a + b + c) / 2.0;
        double areaSquared = s * (s - a) * (s - b) * (s - c);

        return Math.sqrt(areaSquared);
    }

}
