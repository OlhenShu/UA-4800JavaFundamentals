package com.softserve.academy.module3;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber, secondNumber, thirdNumber;

        System.out.println("Input the first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Input the first number: ");
        secondNumber = scanner.nextInt();
        System.out.println("Input the first number: ");
        thirdNumber = scanner.nextInt();

        System.out.println("The smallest number is " + getMinNumber(firstNumber, secondNumber, thirdNumber));

        scanner.close();
    }

    private static int getMinNumber(int first, int second, int third) {
        return Math.min(first, Math.min(second, third));
    }
}
