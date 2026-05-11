package com.softserve.academy.module8.hw.Task2;

import java.util.Scanner;

public class NumberReader {

    public static int readNumber(int start, int end, int count) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter number " + (count + 1) + " between " + start + " and " + end + ": ");
        try {
            number = Integer.parseInt(scanner.nextLine());
            if (number < start || number > end) {
                throw new IllegalArgumentException("Number must be between " + start + " and " + end);
            }
            return number;
        } catch (NumberFormatException e) {
            throw new Exception("Invalid input. Please enter a valid integer.");
        } catch (IllegalArgumentException e) {
            throw new Exception(e.getMessage());
        }
    }

}
