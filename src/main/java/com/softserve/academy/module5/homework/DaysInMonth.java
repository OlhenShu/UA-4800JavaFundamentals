package com.softserve.academy.module5.homework;

import java.util.Scanner;

public class DaysInMonth {

    private static final int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = scanner.nextInt();
        System.out.println((month >= 1) && (month <= 12)
                ? "Days: " + DAYS[month - 1]
                : "Invalid month number");

        scanner.close();
    }

}
