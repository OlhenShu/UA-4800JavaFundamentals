package com.softserve.academy.module4.homework;

import java.util.Scanner;

public class ThreeNumbersRange {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        double num1 = SCANNER.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = SCANNER.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = SCANNER.nextDouble();

        if (num1 < -5 || num1 > 5 || num2 < -5 || num2 > 5 || num3 < -5 || num3 > 5) {
            System.out.println("Not all numbers belong to the range [-5,5]. Please try again.");
        }
        else {
            System.out.println("All numbers belong to the range [-5,5.]." );
        }
    }
}