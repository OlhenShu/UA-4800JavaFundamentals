package com.softserve.academy.module4.homework;

import java.util.Scanner;

public class ThreeNumbersMaxMin {
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("[....This program can determinate max and min values....]");
        System.out.println("Enter the first number: ");
        int num1 = SCANNER.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = SCANNER.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = SCANNER.nextInt();

        System.out.println("The minimum number is " + minNumber(num1, num2, num3));
        System.out.println("The maximum number is " + maxNumber(num1, num2, num3));
    }

    public static int minNumber(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    public static int maxNumber(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
