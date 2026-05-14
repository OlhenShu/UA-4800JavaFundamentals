package com.softserve.academy.module8.pracTask.task1;

import java.util.Scanner;

public class PracTask1 {

    public int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Sides must be non negative");
        }
        return a * b;
    }

    public static void main(String[] args) {
        PracTask1 pracTask1 = new PracTask1();
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            System.out.println("Enter the sides of the rectangle:");
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int square = pracTask1.squareRectangle(a, b);
            System.out.println("Square of the rectangle is: " + square);
        }catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers.");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
