package com.softserve.academy.module4.pracTask;

import java.util.Arrays;
import java.util.Scanner;

public class OddNumberCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter third number: ");
        int c = scanner.nextInt();
        System.out.println("Number of odd numbers: " + new OddNumberCounter().countOddNumbers(a, b, c));
    }

    /**
     * Task said 3 numbers, but I made it more flexible with varargs. You can enter as many numbers as you want.
     * @param a
     * @return number of odd numbers
     */
    public int countOddNumbers(int... a) {
        return (int)Arrays.stream(a).filter(x -> x % 2 != 0).count();
    }

}
