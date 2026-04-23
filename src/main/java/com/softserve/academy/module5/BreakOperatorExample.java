package com.softserve.academy.module5;

import java.util.Scanner;

public class BreakOperatorExample {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = {10, 15, 35, -7, 14, 28, -56, 35, 42, -21};
        System.out.println("Enter a target number: ");
        int target = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Target found at position: " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Target not found in the array.");
        }

        System.out.println("Exited the loop.");

        int sum = 0;
        for (int number : numbers) {
            if (number < 0) {
                System.out.println("Negative number found: " + number);
                continue;
            }
            sum += number;
        }
        System.out.println("Sum of non-negative numbers: " + sum);
        scanner.close();
    }
}