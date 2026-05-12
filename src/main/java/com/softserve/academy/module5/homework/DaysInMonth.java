package com.softserve.academy.module5.homework;

import java.util.Scanner;

public class DaysInMonth {

    private static final int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter month number (1-12): ");
            int month = scanner.nextInt();
            if (month < 1 || month > 12) {
                throw new IllegalArgumentException("Month number must be between 1 and 12");
            } else {
                System.out.println("Days: " + DAYS[month - 1]);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer");
        }
    }

}
