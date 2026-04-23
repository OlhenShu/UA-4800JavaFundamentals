package com.softserve.academy.module4;

public class OperatorExamples {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = a++;

        // Arithmetic operators
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        //Unary operators
        System.out.println("c = " + c);
        System.out.println("a = " + a);

        System.out.println("a++ = " + (c++)); // Post-increment
        System.out.println("a = " + a); //
        System.out.println("a-- = " + (c--)); // Post-decrement
        System.out.println("++a = " + (++c)); // Pre-increment
        System.out.println("a = " + c); //
        System.out.println("--a = " + (--c)); // Pre-decrement
        int d = c++ + ++c + c++ + c++ + ++c;
        System.out.println("d = " + d);


        // Comparison operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        int t = 5;
        int s = 4;
        int v = 7;
        System.out.println((t > s) && (t > v) || (s < v));

        System.out.println((t > s) || (t > v) && (s > v));

        System.out.println((t > s || t > v) && (s > v));

    }
}
