package com.softserve.academy.module8.hw.Task1;

public class Divider {

    private double num1;
    private double num2;

    public Divider(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double div() {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }

}
