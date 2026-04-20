package com.softserve.academy.module4.optional;

import java.util.Scanner;

public class NumericRange {
    public static void main(String[] args) {

        NumericRange numericRange = new NumericRange();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        numericRange.checkNumbersInRange(a,b,c);
    }

    public void checkNumbersInRange(double a, double b, double c) {
        System.out.println((a < -5 || a > 5) ? "First number is not in range [-5;5]" :
                        (b < -5 || b > 5) ? "First number is not in range [-5;5]" :
                        (c < -5 || c > 5) ? "First number is not in range [-5;5]" :
                "All numbers are in range [-5;5]");
    }
}
