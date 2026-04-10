package com.softserve.academy.module1;

/**
 * The OperationsWithPrimitiveTypes class demonstrates basic arithmetic operations
 * with primitive types and some methods from the java.lang.Math class.
 */
public class OperationsWithPrimitiveTypes {
    public static void main(String[] args) {
        // 1. Arithmetic operations
        int a = 10;
        int b = 3;

        int sum = a + b;        // Addition: 13
        int diff = a - b;       // Subtraction: 7
        int prod = a * b;       // Multiplication: 30
        int quot = a / b;       // Division (integer): 3
        int rem = a % b;        // Modulo (remainder): 1

        System.out.println("--- Arithmetic operations ---");
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + diff);
        System.out.println("a * b = " + prod);
        System.out.println("a / b = " + quot);
        System.out.println("a % b = " + rem);

        // 2. Using the Math class for arithmetic
        double num = -25.6;
        double positiveNum = Math.abs(num);      // Absolute value: 25.6
        double powerVal = Math.pow(2, 3);        // Exponentiation (2^3): 8.0
        long roundedVal = Math.round(num);       // Rounding to nearest integer: -26

        System.out.println("\n--- Math class arithmetic methods ---");
        System.out.println("Math.abs(" + num + ") = " + positiveNum);
        System.out.println("Math.pow(2, 3) = " + powerVal);
        System.out.println("Math.round(" + num + ") = " + roundedVal);
        System.out.println("Math.max(10, 20) = " + Math.max(10, 20));
        System.out.println("Math.min(10, 20) = " + Math.min(10, 20));
    }
}
