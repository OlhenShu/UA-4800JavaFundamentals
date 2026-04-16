package com.softserve.academy.module3;

import java.util.Scanner;

/**
 * TheBiggerNumber class provides methods to find the bigger number among three integers and to get user input.
 */
public class TheBiggerNumber {

    // Scanner is declared as a static final variable to be used across the class for user input.
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Returns the bigger number among three integers.
     *
     * @param num1 the first integer
     * @param num2 the second integer
     * @param num3 the third integer
     * @return the bigger number among the three integers
     */
    public static int getBiggerNumber(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    /**
     * Prompts the user to enter a number and returns the entered integer.
     *
     * @param prompt the message to display to the user
     * @return the integer entered by the user
     */
    public static int getNumber(String prompt) {
        System.out.println(prompt);
        return SCANNER.nextInt();
    }
}
