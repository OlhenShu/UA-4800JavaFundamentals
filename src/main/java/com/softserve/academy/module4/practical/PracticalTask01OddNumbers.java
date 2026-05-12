package com.softserve.academy.module4.practical;

import java.util.Scanner;


public class PracticalTask01OddNumbers {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Set first number: ");
        int num1 = SCANNER.nextInt();
        System.out.println("Set second number: ");
        int num2 = SCANNER.nextInt();
        System.out.println("set third number: ");
        int num3 = SCANNER.nextInt();

        int count = 0;
        if (num1 % 2 != 0) {
            count++;
        }
        if (num2 % 2 != 0) {
            count++;
        }
        if (num3 % 2 != 0) {
            count++;
        }
        System.out.println("There are " + count + " odd numbers.");
    }
}
