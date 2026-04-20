package com.softserve.academy.module3;

import java.util.Scanner;

import static java.lang.System.in;

public class SmallestNumber {
    public static void main(String[] args) {
        int num1 = getNumber("Input the first number: ");
        int num2 = getNumber("Input the first number: ");
        int num3 = getNumber("Input the first number: ");
        int smallestNumber = Math.min(num1, Math.min(num2, num3));

        System.out.println("The smallest number is: " + smallestNumber);
    }

    public static int getNumber(String value) {
        System.out.println(value);
        Scanner scan = new Scanner(in);
        return Integer.parseInt(scan.nextLine());
    }

}
