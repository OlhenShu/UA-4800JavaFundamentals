package com.softserve.academy.module3;

public class OverloadExample {
    public static void main(String[] args) {
        System.out.println(sum((short) 1, (short) 2));
        System.out.println(sum(1, 2));
        System.out.println(sum(1.5, 2));
        System.out.println(sum(1.5, 2.5, 3.3));
    }

    public static int sum(int a, int b) {
        System.out.println("Method with two int parameters called");
        return a + b;
    }

    public static short sum(short a, short b) {
        System.out.println("Method with two short parameters called");
        return (short)(a + b);
    }

    public static double sum(double a, double b) {
        System.out.println("Method with two double parameters called");
        return a + b;
    }

    public static int sum(double a, double b, double c) {
        return (int)(a + b + c);
    }
}
