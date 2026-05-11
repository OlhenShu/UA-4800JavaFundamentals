package com.softserve.academy.module4.optional;

import java.util.Scanner;

class OutOfRangeException extends RuntimeException {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class NumericRange {
    public static void main(String[] args) {

        NumericRange numericRange = new NumericRange();

        try (Scanner scanner = new Scanner(System.in); scanner) {
            System.out.println("Enter three numbers:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            numericRange.checkNumbersInRange(a, b, c);
            System.out.println("All numbers are within the range [-5;5]");
        } catch (OutOfRangeException e) {
            System.out.println("Validation failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input must be integers");
        }

    }

    public void checkNumbersInRange(double a, double b, double c) {
        if (a < -5 || a > 5) {
            throw new OutOfRangeException("First number is out of range [-5;5]");
        }
        if (b < -5 || b > 5) {
            throw new OutOfRangeException("Second number is out of range [-5;5]");
        }
        if (c < -5 || c > 5) {
            throw new OutOfRangeException("Third number is out of range [-5;5]");
        }
    }
}
