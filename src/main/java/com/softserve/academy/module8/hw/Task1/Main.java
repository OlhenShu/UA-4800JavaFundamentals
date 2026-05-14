package com.softserve.academy.module8.hw.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first number:");
            double num1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter the second number:");
            double num2 = Double.parseDouble(scanner.nextLine());
            Divider divider = new Divider(num1, num2);
            System.out.println("Result: " + divider.div());
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}
